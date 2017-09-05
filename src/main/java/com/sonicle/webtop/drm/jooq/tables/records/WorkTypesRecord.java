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
public class WorkTypesRecord extends org.jooq.impl.UpdatableRecordImpl<com.sonicle.webtop.drm.jooq.tables.records.WorkTypesRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1725928303;

	/**
	 * Setter for <code>drm.work_types.work_type_id</code>.
	 */
	public void setWorkTypeId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>drm.work_types.work_type_id</code>.
	 */
	public java.lang.Integer getWorkTypeId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>drm.work_types.domain_id</code>.
	 */
	public void setDomainId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>drm.work_types.domain_id</code>.
	 */
	public java.lang.String getDomainId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>drm.work_types.revision_status</code>.
	 */
	public void setRevisionStatus(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>drm.work_types.revision_status</code>.
	 */
	public java.lang.String getRevisionStatus() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>drm.work_types.external_id</code>.
	 */
	public void setExternalId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>drm.work_types.external_id</code>.
	 */
	public java.lang.String getExternalId() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>drm.work_types.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>drm.work_types.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES.WORK_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES.REVISION_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES.EXTERNAL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getWorkTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getRevisionStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getExternalId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkTypesRecord value1(java.lang.Integer value) {
		setWorkTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkTypesRecord value2(java.lang.String value) {
		setDomainId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkTypesRecord value3(java.lang.String value) {
		setRevisionStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkTypesRecord value4(java.lang.String value) {
		setExternalId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkTypesRecord value5(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkTypesRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WorkTypesRecord
	 */
	public WorkTypesRecord() {
		super(com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES);
	}

	/**
	 * Create a detached, initialised WorkTypesRecord
	 */
	public WorkTypesRecord(java.lang.Integer workTypeId, java.lang.String domainId, java.lang.String revisionStatus, java.lang.String externalId, java.lang.String description) {
		super(com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES);

		setValue(0, workTypeId);
		setValue(1, domainId);
		setValue(2, revisionStatus);
		setValue(3, externalId);
		setValue(4, description);
	}
}
