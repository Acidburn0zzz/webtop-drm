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
public class PersonInCharge extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord> {

	private static final long serialVersionUID = -1488820130;

	/**
	 * The reference instance of <code>drm.person_in_charge</code>
	 */
	public static final com.sonicle.webtop.drm.jooq.tables.PersonInCharge PERSON_IN_CHARGE = new com.sonicle.webtop.drm.jooq.tables.PersonInCharge();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord> getRecordType() {
		return com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord.class;
	}

	/**
	 * The column <code>drm.person_in_charge.id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>drm.person_in_charge.domain_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord, java.lang.String> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>drm.person_in_charge.user_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord, java.lang.String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * Create a <code>drm.person_in_charge</code> table reference
	 */
	public PersonInCharge() {
		this("person_in_charge", null);
	}

	/**
	 * Create an aliased <code>drm.person_in_charge</code> table reference
	 */
	public PersonInCharge(java.lang.String alias) {
		this(alias, com.sonicle.webtop.drm.jooq.tables.PersonInCharge.PERSON_IN_CHARGE);
	}

	private PersonInCharge(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord> aliased) {
		this(alias, aliased, null);
	}

	private PersonInCharge(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.drm.jooq.Drm.DRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord> getPrimaryKey() {
		return com.sonicle.webtop.drm.jooq.Keys.PERSON_IN_CHARGE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.PersonInChargeRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.PERSON_IN_CHARGE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.drm.jooq.tables.PersonInCharge as(java.lang.String alias) {
		return new com.sonicle.webtop.drm.jooq.tables.PersonInCharge(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.drm.jooq.tables.PersonInCharge rename(java.lang.String name) {
		return new com.sonicle.webtop.drm.jooq.tables.PersonInCharge(name, null);
	}
}
