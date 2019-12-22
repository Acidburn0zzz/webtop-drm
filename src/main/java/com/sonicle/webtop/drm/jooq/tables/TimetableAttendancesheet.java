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
public class TimetableAttendancesheet extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord> {

	private static final long serialVersionUID = -835068333;

	/**
	 * The reference instance of <code>drm.timetable_attendancesheet</code>
	 */
	public static final com.sonicle.webtop.drm.jooq.tables.TimetableAttendancesheet TIMETABLE_ATTENDANCESHEET = new com.sonicle.webtop.drm.jooq.tables.TimetableAttendancesheet();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord> getRecordType() {
		return com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord.class;
	}

	/**
	 * The column <code>drm.timetable_attendancesheet.operator_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.lang.String> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.group_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.lang.Short> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.day</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.lang.String> DAY = createField("day", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_work</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_WORK = createField("h_work", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_permits</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_PERMITS = createField("h_permits", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_1</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_1 = createField("h_extra_1", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_2</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_2 = createField("h_extra_2", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_3</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_3 = createField("h_extra_3", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_holidays</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_HOLIDAYS = createField("h_holidays", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_disease</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_DISEASE = createField("h_disease", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_total</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_TOTAL = createField("h_total", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.no_load</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.lang.Short> NO_LOAD = createField("no_load", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_reports</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_REPORTS = createField("h_reports", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_work_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_WORK_TOT = createField("h_work_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_work_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_WORK_H = createField("h_work_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_work_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_WORK_MIN = createField("h_work_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_permits_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_PERMITS_TOT = createField("h_permits_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_permits_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_PERMITS_H = createField("h_permits_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_permits_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_PERMITS_MIN = createField("h_permits_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_1_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_1_TOT = createField("h_extra_1_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_2_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_2_TOT = createField("h_extra_2_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_2_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_2_H = createField("h_extra_2_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_2_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_2_MIN = createField("h_extra_2_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_3_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_3_TOT = createField("h_extra_3_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_3_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_3_H = createField("h_extra_3_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_extra_3_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_EXTRA_3_MIN = createField("h_extra_3_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_holidays_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_HOLIDAYS_TOT = createField("h_holidays_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_holidays_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_HOLIDAYS_H = createField("h_holidays_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_holidays_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_HOLIDAYS_MIN = createField("h_holidays_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_disease_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_DISEASE_TOT = createField("h_disease_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_disease_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_DISEASE_H = createField("h_disease_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_disease_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_DISEASE_MIN = createField("h_disease_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_total_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_TOTAL_TOT = createField("h_total_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_total_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_TOTAL_H = createField("h_total_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_total_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_TOTAL_MIN = createField("h_total_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_reports_tot</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_REPORTS_TOT = createField("h_reports_tot", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_reports_h</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_REPORTS_H = createField("h_reports_h", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.h_reports_min</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.math.BigDecimal> H_REPORTS_MIN = createField("h_reports_min", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>drm.timetable_attendancesheet.username</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * Create a <code>drm.timetable_attendancesheet</code> table reference
	 */
	public TimetableAttendancesheet() {
		this("timetable_attendancesheet", null);
	}

	/**
	 * Create an aliased <code>drm.timetable_attendancesheet</code> table reference
	 */
	public TimetableAttendancesheet(java.lang.String alias) {
		this(alias, com.sonicle.webtop.drm.jooq.tables.TimetableAttendancesheet.TIMETABLE_ATTENDANCESHEET);
	}

	private TimetableAttendancesheet(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord> aliased) {
		this(alias, aliased, null);
	}

	private TimetableAttendancesheet(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.drm.jooq.Drm.DRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord> getPrimaryKey() {
		return com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_ATTENDANCESHEET_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.TimetableAttendancesheetRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.TIMETABLE_ATTENDANCESHEET_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.drm.jooq.tables.TimetableAttendancesheet as(java.lang.String alias) {
		return new com.sonicle.webtop.drm.jooq.tables.TimetableAttendancesheet(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.drm.jooq.tables.TimetableAttendancesheet rename(java.lang.String name) {
		return new com.sonicle.webtop.drm.jooq.tables.TimetableAttendancesheet(name, null);
	}
}