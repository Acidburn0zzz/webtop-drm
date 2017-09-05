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
public class WorkReportsAttachments extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord> {

	private static final long serialVersionUID = -459513073;

	/**
	 * The reference instance of <code>drm.work_reports_attachments</code>
	 */
	public static final com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments WORK_REPORTS_ATTACHMENTS = new com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord> getRecordType() {
		return com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord.class;
	}

	/**
	 * The column <code>drm.work_reports_attachments.work_report_attachment_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord, java.lang.String> WORK_REPORT_ATTACHMENT_ID = createField("work_report_attachment_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>drm.work_reports_attachments.work_report_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord, java.lang.String> WORK_REPORT_ID = createField("work_report_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>drm.work_reports_attachments.revision_timestamp</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord, org.joda.time.DateTime> REVISION_TIMESTAMP = createField("revision_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "", new com.sonicle.webtop.core.jooq.DateTimeConverter());

	/**
	 * The column <code>drm.work_reports_attachments.revision_sequence</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord, java.lang.Short> REVISION_SEQUENCE = createField("revision_sequence", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>drm.work_reports_attachments.filename</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord, java.lang.String> FILENAME = createField("filename", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>drm.work_reports_attachments.size</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord, java.lang.Integer> SIZE = createField("size", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>drm.work_reports_attachments.media_tpye</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord, java.lang.String> MEDIA_TPYE = createField("media_tpye", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * Create a <code>drm.work_reports_attachments</code> table reference
	 */
	public WorkReportsAttachments() {
		this("work_reports_attachments", null);
	}

	/**
	 * Create an aliased <code>drm.work_reports_attachments</code> table reference
	 */
	public WorkReportsAttachments(java.lang.String alias) {
		this(alias, com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments.WORK_REPORTS_ATTACHMENTS);
	}

	private WorkReportsAttachments(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private WorkReportsAttachments(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.drm.jooq.Drm.DRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord> getPrimaryKey() {
		return com.sonicle.webtop.drm.jooq.Keys.WORK_REPORTS_DOCUMENTS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.WORK_REPORTS_DOCUMENTS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments as(java.lang.String alias) {
		return new com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments rename(java.lang.String name) {
		return new com.sonicle.webtop.drm.jooq.tables.WorkReportsAttachments(name, null);
	}
}
