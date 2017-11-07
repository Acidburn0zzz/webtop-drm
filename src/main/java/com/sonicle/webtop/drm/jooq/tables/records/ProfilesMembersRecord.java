/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.drm.jooq.tables.records;

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
public class ProfilesMembersRecord extends org.jooq.impl.UpdatableRecordImpl<com.sonicle.webtop.drm.jooq.tables.records.ProfilesMembersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -2050551106;

	/**
	 * Setter for <code>drm.profiles_members.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>drm.profiles_members.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>drm.profiles_members.profile_id</code>.
	 */
	public void setProfileId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>drm.profiles_members.profile_id</code>.
	 */
	public java.lang.String getProfileId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>drm.profiles_members.user_id</code>.
	 */
	public void setUserId(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>drm.profiles_members.user_id</code>.
	 */
	public java.lang.String getUserId() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.sonicle.webtop.drm.jooq.tables.ProfilesMembers.PROFILES_MEMBERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.sonicle.webtop.drm.jooq.tables.ProfilesMembers.PROFILES_MEMBERS.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.sonicle.webtop.drm.jooq.tables.ProfilesMembers.PROFILES_MEMBERS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getProfileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfilesMembersRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfilesMembersRecord value2(java.lang.String value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfilesMembersRecord value3(java.lang.String value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfilesMembersRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProfilesMembersRecord
	 */
	public ProfilesMembersRecord() {
		super(com.sonicle.webtop.drm.jooq.tables.ProfilesMembers.PROFILES_MEMBERS);
	}

	/**
	 * Create a detached, initialised ProfilesMembersRecord
	 */
	public ProfilesMembersRecord(java.lang.Integer id, java.lang.String profileId, java.lang.String userId) {
		super(com.sonicle.webtop.drm.jooq.tables.ProfilesMembers.PROFILES_MEMBERS);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, userId);
	}
}