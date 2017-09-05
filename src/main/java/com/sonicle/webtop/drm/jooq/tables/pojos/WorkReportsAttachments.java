/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.drm.jooq.tables.pojos;

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
public class WorkReportsAttachments implements java.io.Serializable {

	private static final long serialVersionUID = -806876543;

	private java.lang.String       workReportAttachmentId;
	private java.lang.String       workReportId;
	private org.joda.time.DateTime revisionTimestamp;
	private java.lang.Short        revisionSequence;
	private java.lang.String       filename;
	private java.lang.Integer      size;
	private java.lang.String       mediaTpye;

	public WorkReportsAttachments() {}

	public WorkReportsAttachments(
		java.lang.String       workReportAttachmentId,
		java.lang.String       workReportId,
		org.joda.time.DateTime revisionTimestamp,
		java.lang.Short        revisionSequence,
		java.lang.String       filename,
		java.lang.Integer      size,
		java.lang.String       mediaTpye
	) {
		this.workReportAttachmentId = workReportAttachmentId;
		this.workReportId = workReportId;
		this.revisionTimestamp = revisionTimestamp;
		this.revisionSequence = revisionSequence;
		this.filename = filename;
		this.size = size;
		this.mediaTpye = mediaTpye;
	}

	public java.lang.String getWorkReportAttachmentId() {
		return this.workReportAttachmentId;
	}

	public void setWorkReportAttachmentId(java.lang.String workReportAttachmentId) {
		this.workReportAttachmentId = workReportAttachmentId;
	}

	public java.lang.String getWorkReportId() {
		return this.workReportId;
	}

	public void setWorkReportId(java.lang.String workReportId) {
		this.workReportId = workReportId;
	}

	public org.joda.time.DateTime getRevisionTimestamp() {
		return this.revisionTimestamp;
	}

	public void setRevisionTimestamp(org.joda.time.DateTime revisionTimestamp) {
		this.revisionTimestamp = revisionTimestamp;
	}

	public java.lang.Short getRevisionSequence() {
		return this.revisionSequence;
	}

	public void setRevisionSequence(java.lang.Short revisionSequence) {
		this.revisionSequence = revisionSequence;
	}

	public java.lang.String getFilename() {
		return this.filename;
	}

	public void setFilename(java.lang.String filename) {
		this.filename = filename;
	}

	public java.lang.Integer getSize() {
		return this.size;
	}

	public void setSize(java.lang.Integer size) {
		this.size = size;
	}

	public java.lang.String getMediaTpye() {
		return this.mediaTpye;
	}

	public void setMediaTpye(java.lang.String mediaTpye) {
		this.mediaTpye = mediaTpye;
	}
}
