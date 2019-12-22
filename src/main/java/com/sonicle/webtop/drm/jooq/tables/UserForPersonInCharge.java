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
public class UserForPersonInCharge extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord> {

	private static final long serialVersionUID = -51741747;

	/**
	 * The reference instance of <code>drm.user_for_person_in_charge</code>
	 */
	public static final com.sonicle.webtop.drm.jooq.tables.UserForPersonInCharge USER_FOR_PERSON_IN_CHARGE = new com.sonicle.webtop.drm.jooq.tables.UserForPersonInCharge();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord> getRecordType() {
		return com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord.class;
	}

	/**
	 * The column <code>drm.user_for_person_in_charge.id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>drm.user_for_person_in_charge.domain_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord, java.lang.String> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>drm.user_for_person_in_charge.person_in_charge_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord, java.lang.Integer> PERSON_IN_CHARGE_ID = createField("person_in_charge_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>drm.user_for_person_in_charge.user_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * Create a <code>drm.user_for_person_in_charge</code> table reference
	 */
	public UserForPersonInCharge() {
		this("user_for_person_in_charge", null);
	}

	/**
	 * Create an aliased <code>drm.user_for_person_in_charge</code> table reference
	 */
	public UserForPersonInCharge(java.lang.String alias) {
		this(alias, com.sonicle.webtop.drm.jooq.tables.UserForPersonInCharge.USER_FOR_PERSON_IN_CHARGE);
	}

	private UserForPersonInCharge(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserForPersonInCharge(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.drm.jooq.Drm.DRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord> getPrimaryKey() {
		return com.sonicle.webtop.drm.jooq.Keys.USER_FOR_PERSON_IN_CHARGE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.UserForPersonInChargeRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.USER_FOR_PERSON_IN_CHARGE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.drm.jooq.tables.UserForPersonInCharge as(java.lang.String alias) {
		return new com.sonicle.webtop.drm.jooq.tables.UserForPersonInCharge(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.drm.jooq.tables.UserForPersonInCharge rename(java.lang.String name) {
		return new com.sonicle.webtop.drm.jooq.tables.UserForPersonInCharge(name, null);
	}
}