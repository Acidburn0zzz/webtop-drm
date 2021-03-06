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
public class TimetableRequestsHoliday implements java.io.Serializable {

	private static final long serialVersionUID = -356049776;

	private java.math.BigInteger   holidayId;
	private java.lang.String       login;
	private java.lang.String       domainId;
	private java.lang.String       type;
	private java.lang.String       responsible;
	private java.lang.String       emailResponsible;
	private org.joda.time.DateTime dateFrom;
	private org.joda.time.DateTime dateTo;
	private java.lang.String       hFrom;
	private java.lang.String       hTo;
	private java.lang.String       status;
	private java.lang.String       approved;
	private org.joda.time.DateTime dateRequest;
	private java.lang.String       requestCancel;
	private java.math.BigInteger   eventId;
	private java.lang.String       note;

	public TimetableRequestsHoliday() {}

	public TimetableRequestsHoliday(
		java.math.BigInteger   holidayId,
		java.lang.String       login,
		java.lang.String       domainId,
		java.lang.String       type,
		java.lang.String       responsible,
		java.lang.String       emailResponsible,
		org.joda.time.DateTime dateFrom,
		org.joda.time.DateTime dateTo,
		java.lang.String       hFrom,
		java.lang.String       hTo,
		java.lang.String       status,
		java.lang.String       approved,
		org.joda.time.DateTime dateRequest,
		java.lang.String       requestCancel,
		java.math.BigInteger   eventId,
		java.lang.String       note
	) {
		this.holidayId = holidayId;
		this.login = login;
		this.domainId = domainId;
		this.type = type;
		this.responsible = responsible;
		this.emailResponsible = emailResponsible;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.hFrom = hFrom;
		this.hTo = hTo;
		this.status = status;
		this.approved = approved;
		this.dateRequest = dateRequest;
		this.requestCancel = requestCancel;
		this.eventId = eventId;
		this.note = note;
	}

	public java.math.BigInteger getHolidayId() {
		return this.holidayId;
	}

	public void setHolidayId(java.math.BigInteger holidayId) {
		this.holidayId = holidayId;
	}

	public java.lang.String getLogin() {
		return this.login;
	}

	public void setLogin(java.lang.String login) {
		this.login = login;
	}

	public java.lang.String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.String domainId) {
		this.domainId = domainId;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getResponsible() {
		return this.responsible;
	}

	public void setResponsible(java.lang.String responsible) {
		this.responsible = responsible;
	}

	public java.lang.String getEmailResponsible() {
		return this.emailResponsible;
	}

	public void setEmailResponsible(java.lang.String emailResponsible) {
		this.emailResponsible = emailResponsible;
	}

	public org.joda.time.DateTime getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(org.joda.time.DateTime dateFrom) {
		this.dateFrom = dateFrom;
	}

	public org.joda.time.DateTime getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(org.joda.time.DateTime dateTo) {
		this.dateTo = dateTo;
	}

	public java.lang.String getHFrom() {
		return this.hFrom;
	}

	public void setHFrom(java.lang.String hFrom) {
		this.hFrom = hFrom;
	}

	public java.lang.String getHTo() {
		return this.hTo;
	}

	public void setHTo(java.lang.String hTo) {
		this.hTo = hTo;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getApproved() {
		return this.approved;
	}

	public void setApproved(java.lang.String approved) {
		this.approved = approved;
	}

	public org.joda.time.DateTime getDateRequest() {
		return this.dateRequest;
	}

	public void setDateRequest(org.joda.time.DateTime dateRequest) {
		this.dateRequest = dateRequest;
	}

	public java.lang.String getRequestCancel() {
		return this.requestCancel;
	}

	public void setRequestCancel(java.lang.String requestCancel) {
		this.requestCancel = requestCancel;
	}

	public java.math.BigInteger getEventId() {
		return this.eventId;
	}

	public void setEventId(java.math.BigInteger eventId) {
		this.eventId = eventId;
	}

	public java.lang.String getNote() {
		return this.note;
	}

	public void setNote(java.lang.String note) {
		this.note = note;
	}
}
