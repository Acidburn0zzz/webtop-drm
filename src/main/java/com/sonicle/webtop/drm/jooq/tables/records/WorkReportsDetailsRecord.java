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
public class WorkReportsDetailsRecord extends org.jooq.impl.UpdatableRecordImpl<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsDetailsRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.Short, java.lang.Integer, java.lang.Short, java.lang.String> {

	private static final long serialVersionUID = 644189500;

	/**
	 * Setter for <code>drm.work_reports_details.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>drm.work_reports_details.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>drm.work_reports_details.work_report_id</code>.
	 */
	public void setWorkReportId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>drm.work_reports_details.work_report_id</code>.
	 */
	public java.lang.String getWorkReportId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>drm.work_reports_details.row_no</code>.
	 */
	public void setRowNo(java.lang.Short value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>drm.work_reports_details.row_no</code>.
	 */
	public java.lang.Short getRowNo() {
		return (java.lang.Short) getValue(2);
	}

	/**
	 * Setter for <code>drm.work_reports_details.work_type_id</code>.
	 */
	public void setWorkTypeId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>drm.work_reports_details.work_type_id</code>.
	 */
	public java.lang.Integer getWorkTypeId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>drm.work_reports_details.duration</code>.
	 */
	public void setDuration(java.lang.Short value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>drm.work_reports_details.duration</code>.
	 */
	public java.lang.Short getDuration() {
		return (java.lang.Short) getValue(4);
	}

	/**
	 * Setter for <code>drm.work_reports_details.row_flag</code>.
	 */
	public void setRowFlag(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>drm.work_reports_details.row_flag</code>.
	 */
	public java.lang.String getRowFlag() {
		return (java.lang.String) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.Short, java.lang.Integer, java.lang.Short, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.Short, java.lang.Integer, java.lang.Short, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS.WORK_REPORT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field3() {
		return com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS.ROW_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS.WORK_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field5() {
		return com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS.DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS.ROW_FLAG;
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
		return getWorkReportId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value3() {
		return getRowNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getWorkTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value5() {
		return getDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getRowFlag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkReportsDetailsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkReportsDetailsRecord value2(java.lang.String value) {
		setWorkReportId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkReportsDetailsRecord value3(java.lang.Short value) {
		setRowNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkReportsDetailsRecord value4(java.lang.Integer value) {
		setWorkTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkReportsDetailsRecord value5(java.lang.Short value) {
		setDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkReportsDetailsRecord value6(java.lang.String value) {
		setRowFlag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorkReportsDetailsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Short value3, java.lang.Integer value4, java.lang.Short value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WorkReportsDetailsRecord
	 */
	public WorkReportsDetailsRecord() {
		super(com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS);
	}

	/**
	 * Create a detached, initialised WorkReportsDetailsRecord
	 */
	public WorkReportsDetailsRecord(java.lang.Integer id, java.lang.String workReportId, java.lang.Short rowNo, java.lang.Integer workTypeId, java.lang.Short duration, java.lang.String rowFlag) {
		super(com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS);

		setValue(0, id);
		setValue(1, workReportId);
		setValue(2, rowNo);
		setValue(3, workTypeId);
		setValue(4, duration);
		setValue(5, rowFlag);
	}
}
