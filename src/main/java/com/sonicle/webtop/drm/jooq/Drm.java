/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.drm.jooq;

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
public class Drm extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1864591608;

	/**
	 * The reference instance of <code>drm</code>
	 */
	public static final Drm DRM = new Drm();

	/**
	 * No further instances allowed
	 */
	private Drm() {
		super("drm");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_BUSINESS_TRIPS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_COMPANIES,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_COMPANIES_USERS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_DOC_STATUSES,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_DOC_STATUSES_GROUPS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_FOLDERS_GROUPS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_GROUPS_USERS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_PROFILES_MASTERDATA,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_PROFILES_SUPERVISED_USERS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_PROFILES_USERS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_WORK_REPORT_DETAILS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_WORK_REPORTS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_WORK_REPORTS_COUNT,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_WORK_REPORTS_SETTINGS,
			com.sonicle.webtop.drm.jooq.Sequences.SEQ_WORK_TYPES);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.sonicle.webtop.drm.jooq.tables.BusinessTrips.BUSINESS_TRIPS,
			com.sonicle.webtop.drm.jooq.tables.Companies.COMPANIES,
			com.sonicle.webtop.drm.jooq.tables.CompaniesUsers.COMPANIES_USERS,
			com.sonicle.webtop.drm.jooq.tables.DocStatuses.DOC_STATUSES,
			com.sonicle.webtop.drm.jooq.tables.DocStatusesGroups.DOC_STATUSES_GROUPS,
			com.sonicle.webtop.drm.jooq.tables.EnabledPrograms.ENABLED_PROGRAMS,
			com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS,
			com.sonicle.webtop.drm.jooq.tables.FoldersGroups.FOLDERS_GROUPS,
			com.sonicle.webtop.drm.jooq.tables.Groups.GROUPS,
			com.sonicle.webtop.drm.jooq.tables.GroupsUsers.GROUPS_USERS,
			com.sonicle.webtop.drm.jooq.tables.Profiles.PROFILES,
			com.sonicle.webtop.drm.jooq.tables.ProfilesMasterdata.PROFILES_MASTERDATA,
			com.sonicle.webtop.drm.jooq.tables.ProfilesSupervisedUsers.PROFILES_SUPERVISED_USERS,
			com.sonicle.webtop.drm.jooq.tables.ProfilesUsers.PROFILES_USERS,
			com.sonicle.webtop.drm.jooq.tables.WorkReports.WORK_REPORTS,
			com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS,
			com.sonicle.webtop.drm.jooq.tables.WorkReportsDetails.WORK_REPORTS_DETAILS,
			com.sonicle.webtop.drm.jooq.tables.WorkReportsSettings.WORK_REPORTS_SETTINGS,
			com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES);
	}
}