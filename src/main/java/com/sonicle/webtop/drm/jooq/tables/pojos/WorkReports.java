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
public class WorkReports implements java.io.Serializable {

	private static final long serialVersionUID = -252263157;

	private java.lang.String       workReportId;
	private java.lang.String       workReportNo;
	private java.lang.Integer      companyId;
	private java.lang.String       userId;
	private java.lang.String       revisionStatus;
	private org.joda.time.DateTime revisionTimestamp;
	private java.lang.Integer      revisionSequence;
	private java.lang.Integer      docStatusId;
	private java.lang.Integer      contactId;
	private java.lang.String       customerId;
	private java.lang.String       customerStatId;
	private org.joda.time.DateTime fromDate;
	private org.joda.time.DateTime toDate;
	private java.lang.String       referenceNo;
	private java.lang.String       causal;
	private java.lang.Integer      causalId;
	private java.lang.String       ddtNo;
	private org.joda.time.DateTime ddtDate;
	private java.lang.String       notes;
	private java.lang.String       description;
	private java.lang.Boolean      applySignature;
	private java.lang.Boolean      chargeTo;
	private java.lang.Boolean      freeSupport;
	private java.lang.Integer      businessTripId;
	private java.lang.Short        dayTrasfert;

	public WorkReports() {}

	public WorkReports(
		java.lang.String       workReportId,
		java.lang.String       workReportNo,
		java.lang.Integer      companyId,
		java.lang.String       userId,
		java.lang.String       revisionStatus,
		org.joda.time.DateTime revisionTimestamp,
		java.lang.Integer      revisionSequence,
		java.lang.Integer      docStatusId,
		java.lang.Integer      contactId,
		java.lang.String       customerId,
		java.lang.String       customerStatId,
		org.joda.time.DateTime fromDate,
		org.joda.time.DateTime toDate,
		java.lang.String       referenceNo,
		java.lang.String       causal,
		java.lang.Integer      causalId,
		java.lang.String       ddtNo,
		org.joda.time.DateTime ddtDate,
		java.lang.String       notes,
		java.lang.String       description,
		java.lang.Boolean      applySignature,
		java.lang.Boolean      chargeTo,
		java.lang.Boolean      freeSupport,
		java.lang.Integer      businessTripId,
		java.lang.Short        dayTrasfert
	) {
		this.workReportId = workReportId;
		this.workReportNo = workReportNo;
		this.companyId = companyId;
		this.userId = userId;
		this.revisionStatus = revisionStatus;
		this.revisionTimestamp = revisionTimestamp;
		this.revisionSequence = revisionSequence;
		this.docStatusId = docStatusId;
		this.contactId = contactId;
		this.customerId = customerId;
		this.customerStatId = customerStatId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.referenceNo = referenceNo;
		this.causal = causal;
		this.causalId = causalId;
		this.ddtNo = ddtNo;
		this.ddtDate = ddtDate;
		this.notes = notes;
		this.description = description;
		this.applySignature = applySignature;
		this.chargeTo = chargeTo;
		this.freeSupport = freeSupport;
		this.businessTripId = businessTripId;
		this.dayTrasfert = dayTrasfert;
	}

	public java.lang.String getWorkReportId() {
		return this.workReportId;
	}

	public void setWorkReportId(java.lang.String workReportId) {
		this.workReportId = workReportId;
	}

	public java.lang.String getWorkReportNo() {
		return this.workReportNo;
	}

	public void setWorkReportNo(java.lang.String workReportNo) {
		this.workReportNo = workReportNo;
	}

	public java.lang.Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(java.lang.Integer companyId) {
		this.companyId = companyId;
	}

	public java.lang.String getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}

	public java.lang.String getRevisionStatus() {
		return this.revisionStatus;
	}

	public void setRevisionStatus(java.lang.String revisionStatus) {
		this.revisionStatus = revisionStatus;
	}

	public org.joda.time.DateTime getRevisionTimestamp() {
		return this.revisionTimestamp;
	}

	public void setRevisionTimestamp(org.joda.time.DateTime revisionTimestamp) {
		this.revisionTimestamp = revisionTimestamp;
	}

	public java.lang.Integer getRevisionSequence() {
		return this.revisionSequence;
	}

	public void setRevisionSequence(java.lang.Integer revisionSequence) {
		this.revisionSequence = revisionSequence;
	}

	public java.lang.Integer getDocStatusId() {
		return this.docStatusId;
	}

	public void setDocStatusId(java.lang.Integer docStatusId) {
		this.docStatusId = docStatusId;
	}

	public java.lang.Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(java.lang.Integer contactId) {
		this.contactId = contactId;
	}

	public java.lang.String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(java.lang.String customerId) {
		this.customerId = customerId;
	}

	public java.lang.String getCustomerStatId() {
		return this.customerStatId;
	}

	public void setCustomerStatId(java.lang.String customerStatId) {
		this.customerStatId = customerStatId;
	}

	public org.joda.time.DateTime getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(org.joda.time.DateTime fromDate) {
		this.fromDate = fromDate;
	}

	public org.joda.time.DateTime getToDate() {
		return this.toDate;
	}

	public void setToDate(org.joda.time.DateTime toDate) {
		this.toDate = toDate;
	}

	public java.lang.String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(java.lang.String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public java.lang.String getCausal() {
		return this.causal;
	}

	public void setCausal(java.lang.String causal) {
		this.causal = causal;
	}

	public java.lang.Integer getCausalId() {
		return this.causalId;
	}

	public void setCausalId(java.lang.Integer causalId) {
		this.causalId = causalId;
	}

	public java.lang.String getDdtNo() {
		return this.ddtNo;
	}

	public void setDdtNo(java.lang.String ddtNo) {
		this.ddtNo = ddtNo;
	}

	public org.joda.time.DateTime getDdtDate() {
		return this.ddtDate;
	}

	public void setDdtDate(org.joda.time.DateTime ddtDate) {
		this.ddtDate = ddtDate;
	}

	public java.lang.String getNotes() {
		return this.notes;
	}

	public void setNotes(java.lang.String notes) {
		this.notes = notes;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.Boolean getApplySignature() {
		return this.applySignature;
	}

	public void setApplySignature(java.lang.Boolean applySignature) {
		this.applySignature = applySignature;
	}

	public java.lang.Boolean getChargeTo() {
		return this.chargeTo;
	}

	public void setChargeTo(java.lang.Boolean chargeTo) {
		this.chargeTo = chargeTo;
	}

	public java.lang.Boolean getFreeSupport() {
		return this.freeSupport;
	}

	public void setFreeSupport(java.lang.Boolean freeSupport) {
		this.freeSupport = freeSupport;
	}

	public java.lang.Integer getBusinessTripId() {
		return this.businessTripId;
	}

	public void setBusinessTripId(java.lang.Integer businessTripId) {
		this.businessTripId = businessTripId;
	}

	public java.lang.Short getDayTrasfert() {
		return this.dayTrasfert;
	}

	public void setDayTrasfert(java.lang.Short dayTrasfert) {
		this.dayTrasfert = dayTrasfert;
	}
}
