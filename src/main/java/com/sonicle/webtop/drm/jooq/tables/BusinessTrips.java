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
public class BusinessTrips extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> {

	private static final long serialVersionUID = -1329469809;

	/**
	 * The reference instance of <code>drm.business_trips</code>
	 */
	public static final com.sonicle.webtop.drm.jooq.tables.BusinessTrips BUSINESS_TRIPS = new com.sonicle.webtop.drm.jooq.tables.BusinessTrips();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> getRecordType() {
		return com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord.class;
	}

	/**
	 * The column <code>drm.business_trips.business_trip_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.Integer> BUSINESS_TRIP_ID = createField("business_trip_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.business_trips.domain_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

	/**
	 * The column <code>drm.business_trips.revision_status</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> REVISION_STATUS = createField("revision_status", org.jooq.impl.SQLDataType.VARCHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>drm.business_trips.external_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>drm.business_trips.description</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * Create a <code>drm.business_trips</code> table reference
	 */
	public BusinessTrips() {
		this("business_trips", null);
	}

	/**
	 * Create an aliased <code>drm.business_trips</code> table reference
	 */
	public BusinessTrips(java.lang.String alias) {
		this(alias, com.sonicle.webtop.drm.jooq.tables.BusinessTrips.BUSINESS_TRIPS);
	}

	private BusinessTrips(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> aliased) {
		this(alias, aliased, null);
	}

	private BusinessTrips(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.drm.jooq.Drm.DRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord, java.lang.Integer> getIdentity() {
		return com.sonicle.webtop.drm.jooq.Keys.IDENTITY_BUSINESS_TRIPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord> getPrimaryKey() {
		return com.sonicle.webtop.drm.jooq.Keys.BUSINESS_TRIPS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.BusinessTripsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.BUSINESS_TRIPS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.drm.jooq.tables.BusinessTrips as(java.lang.String alias) {
		return new com.sonicle.webtop.drm.jooq.tables.BusinessTrips(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.drm.jooq.tables.BusinessTrips rename(java.lang.String name) {
		return new com.sonicle.webtop.drm.jooq.tables.BusinessTrips(name, null);
	}
}