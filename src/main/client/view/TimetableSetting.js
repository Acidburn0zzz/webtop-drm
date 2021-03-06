/* 
 * Copyright (C) 2017 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2017 Sonicle S.r.l.".
 */
Ext.define('Sonicle.webtop.drm.view.TimetableSetting', {
	extend: 'WTA.sdk.ModelView',
	dockableConfig: {
		title: '{timetable.config.tit}', //localizzato
		iconCls: 'wtdrm-icon-configuration-generalconfiguration-xs',
		width: 500,
		height: 500
	},
	modelName: 'Sonicle.webtop.drm.model.TimetableSetting',
	initComponent: function () {
		var me = this;
		me.callParent(arguments);
		me.add({
			region: 'center',
			xtype: 'tabpanel',
			items: [
				{
					xtype: 'wtform',
					title: me.mys.res('timetable.settings.tit'),
					defaults: {
						labelWidth: 160
					},
					items: [
						{
							xtype: 'textfield',
							bind: '{record.allowedAddresses}',
							fieldLabel: me.mys.res('timetable.settings.fld-allowedaddresses.lbl')
						},
						{
							xtype: 'textfield',
							bind: '{record.allowedUsers}',
							fieldLabel: me.mys.res('timetable.settings.fld-allowedusers.lbl')
						},
						{
							xtype: 'textfield',
							bind: '{record.staffOfficeEmail}',
							fieldLabel: me.mys.res('timetable.settings.fld-staffofficeemail.lbl')
						},
						{
							xtype: 'textfield',
							bind: '{record.totalToleranceInMinutes}',
							fieldLabel: me.mys.res('timetable.settings.fld-totaltoleranceinminutes.lbl')
						},
						WTF.lookupCombo('id', 'desc', {
							bind: '{record.rounding}',
							store: Ext.create('Sonicle.webtop.drm.store.RoundingHour', {
								autoLoad: true
							}),
							triggers: {
								clear: WTF.clearTrigger()
							},
							emptyText: WT.res('word.none.male'),
							fieldLabel: me.mys.res('timetable.settings.fld-rounding.lbl')
						}),
						{
							xtype: 'textfield',
							bind: '{record.minimumExtraordinary}',
							fieldLabel: me.mys.res('timetable.settings.fld-minimumextraordinary.lbl')
						},
						{
							xtype: 'checkbox',
							bind: '{record.breakAnomaly}',
							boxLabel: me.mys.res('timetable.settings.fld-breakanomaly.lbl')
						},
						{
							xtype: 'checkbox',
							bind: '{record.readOnlyEvents}',
							boxLabel: me.mys.res('timetable.settings.fld-readonlyevents.lbl')
						},
						{
							xtype: 'checkbox',
							bind: '{record.requestsHolidaysPermitsPreviousDates}',
							boxLabel: me.mys.res('timetable.settings.fld-requestsholidayspermitspreviousdates.lbl')
						}
					]
				},
				{
					title: me.mys.res('holidaydates.tit'),
					xtype: 'grid',
					reference: 'gpHolidayDate',
					bind: {
						store: '{record.holidayDate}'
					},
					width: '100%',
					border: true,
					flex: 2,
					columns: [
						{
							dataIndex: 'date',
							editor: {
								xtype: 'datefield',
								allowBlank: false
							},
							header: me.mys.res('gpholidaydate.date.lbl'),
							flex: 1
						},
						{
							dataIndex: 'description',
							editor: {
								xtype: 'textfield',
								allowBlank: false
							},
							header: me.mys.res('gpholidaydate.description.lbl'),
							flex: 1
						}
					],
					tbar: [
						me.addAct('add', {
							text: WT.res('act-add.lbl'),
							tooltip: null,
							iconCls: 'wt-icon-add-xs',
							handler: function () {
								me.addHolidayDate();
							},
							scope: me
						}),
						me.addAct('delete', {
							text: WT.res('act-delete.lbl'),
							tooltip: null,
							iconCls: 'wt-icon-delete-xs',
							handler: function () {
								var sm = me.lref('gpHolidayDate').getSelectionModel();
								me.deleteHolidayDate(sm.getSelection());
							},
							scope: me
						})
					],
					plugins: {
						ptype: 'cellediting',
						clicksToEdit: 1
					}

				}
			]
		});
	},
	addHolidayDate: function () {
		var me = this;
		var gp = me.lref('gpHolidayDate'),
				sto = gp.getStore(),
				cep = gp.findPlugin('cellediting');


		cep.cancelEdit();

		sto.add(sto.createModel({
			date: null,
			description: null
		}));

		cep.startEditByPosition({row: sto.getCount(), column: 0});
	},
	deleteHolidayDate: function (rec) {
		var me = this,
				grid = me.lref('gpHolidayDate'),
				sto = grid.getStore(),
				cellediting = grid.findPlugin('cellediting');

		WT.confirm(WT.res('confirm.delete'), function (bid) {
			if (bid === 'yes') {
				cellediting.cancelEdit();
				sto.remove(rec);
			}
		}, me);
	}
});
