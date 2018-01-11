/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.drm.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExpenseNoteSettings extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord> {

	private static final long serialVersionUID = -1116978512;

	/**
	 * The reference instance of <code>drm.expense_note_settings</code>
	 */
	public static final com.sonicle.webtop.drm.jooq.tables.ExpenseNoteSettings EXPENSE_NOTE_SETTINGS = new com.sonicle.webtop.drm.jooq.tables.ExpenseNoteSettings();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord> getRecordType() {
		return com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord.class;
	}

	/**
	 * The column <code>drm.expense_note_settings.integrate_tracking</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord, java.lang.String> INTEGRATE_TRACKING = createField("integrate_tracking", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>drm.expense_note_settings.integrate_mail</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord, java.lang.String> INTEGRATE_MAIL = createField("integrate_mail", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>drm.expense_note_settings.integrate_cloud</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord, java.lang.String> INTEGRATE_CLOUD = createField("integrate_cloud", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>drm.expense_note_settings.domain_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord, java.lang.String> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>drm.expense_note_settings.operator_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord, java.lang.String> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>drm.expense_note_settings.integrate_calendar</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord, java.lang.String> INTEGRATE_CALENDAR = createField("integrate_calendar", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * Create a <code>drm.expense_note_settings</code> table reference
	 */
	public ExpenseNoteSettings() {
		this("expense_note_settings", null);
	}

	/**
	 * Create an aliased <code>drm.expense_note_settings</code> table reference
	 */
	public ExpenseNoteSettings(java.lang.String alias) {
		this(alias, com.sonicle.webtop.drm.jooq.tables.ExpenseNoteSettings.EXPENSE_NOTE_SETTINGS);
	}

	private ExpenseNoteSettings(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord> aliased) {
		this(alias, aliased, null);
	}

	private ExpenseNoteSettings(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteSettingsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.drm.jooq.Drm.DRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.drm.jooq.tables.ExpenseNoteSettings as(java.lang.String alias) {
		return new com.sonicle.webtop.drm.jooq.tables.ExpenseNoteSettings(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.drm.jooq.tables.ExpenseNoteSettings rename(java.lang.String name) {
		return new com.sonicle.webtop.drm.jooq.tables.ExpenseNoteSettings(name, null);
	}
}
