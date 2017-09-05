/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.drm.jooq;

/**
 * Convenience access to all sequences in drm
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>drm.seq_business_trips</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_BUSINESS_TRIPS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_business_trips", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_companies</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_COMPANIES = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_companies", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_companies_users</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_COMPANIES_USERS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_companies_users", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_doc_statuses</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_DOC_STATUSES = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_doc_statuses", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_doc_statuses_groups</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_DOC_STATUSES_GROUPS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_doc_statuses_groups", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_folders_groups</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_FOLDERS_GROUPS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_folders_groups", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_groups_users</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_GROUPS_USERS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_groups_users", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_profiles_masterdata</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_PROFILES_MASTERDATA = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_profiles_masterdata", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_profiles_supervised_users</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_PROFILES_SUPERVISED_USERS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_profiles_supervised_users", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_profiles_users</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_PROFILES_USERS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_profiles_users", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_work_report_details</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_WORK_REPORT_DETAILS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_work_report_details", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_work_reports</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_WORK_REPORTS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_work_reports", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_work_reports_count</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_WORK_REPORTS_COUNT = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_work_reports_count", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_work_reports_settings</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_WORK_REPORTS_SETTINGS = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_work_reports_settings", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>drm.seq_work_types</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> SEQ_WORK_TYPES = new org.jooq.impl.SequenceImpl<java.lang.Long>("seq_work_types", com.sonicle.webtop.drm.jooq.Drm.DRM, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
