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
public class TimetableMovements implements java.io.Serializable {

	private static final long serialVersionUID = 771976706;

	private java.lang.Integer      movementId;
	private java.lang.String       typeMovement;
	private java.lang.String       operatorId;
	private org.joda.time.DateTime dateFrom;
	private org.joda.time.DateTime dateTo;
	private java.sql.Time          duration;
	private java.lang.String       description;
	private java.lang.String       reference;
	private java.lang.String       state;
	private java.lang.String       category;
	private java.lang.String       nReport;
	private java.lang.String       username;

	public TimetableMovements() {}

	public TimetableMovements(
		java.lang.Integer      movementId,
		java.lang.String       typeMovement,
		java.lang.String       operatorId,
		org.joda.time.DateTime dateFrom,
		org.joda.time.DateTime dateTo,
		java.sql.Time          duration,
		java.lang.String       description,
		java.lang.String       reference,
		java.lang.String       state,
		java.lang.String       category,
		java.lang.String       nReport,
		java.lang.String       username
	) {
		this.movementId = movementId;
		this.typeMovement = typeMovement;
		this.operatorId = operatorId;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.duration = duration;
		this.description = description;
		this.reference = reference;
		this.state = state;
		this.category = category;
		this.nReport = nReport;
		this.username = username;
	}

	public java.lang.Integer getMovementId() {
		return this.movementId;
	}

	public void setMovementId(java.lang.Integer movementId) {
		this.movementId = movementId;
	}

	public java.lang.String getTypeMovement() {
		return this.typeMovement;
	}

	public void setTypeMovement(java.lang.String typeMovement) {
		this.typeMovement = typeMovement;
	}

	public java.lang.String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(java.lang.String operatorId) {
		this.operatorId = operatorId;
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

	public java.sql.Time getDuration() {
		return this.duration;
	}

	public void setDuration(java.sql.Time duration) {
		this.duration = duration;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getReference() {
		return this.reference;
	}

	public void setReference(java.lang.String reference) {
		this.reference = reference;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getCategory() {
		return this.category;
	}

	public void setCategory(java.lang.String category) {
		this.category = category;
	}

	public java.lang.String getNReport() {
		return this.nReport;
	}

	public void setNReport(java.lang.String nReport) {
		this.nReport = nReport;
	}

	public java.lang.String getUsername() {
		return this.username;
	}

	public void setUsername(java.lang.String username) {
		this.username = username;
	}
}
