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
public class ExpenseNoteSettings implements java.io.Serializable {

	private static final long serialVersionUID = -858828350;

	private java.lang.String integrateTracking;
	private java.lang.String integrateMail;
	private java.lang.String integrateCloud;
	private java.lang.String domainId;
	private java.lang.String operatorId;
	private java.lang.String integrateCalendar;

	public ExpenseNoteSettings() {}

	public ExpenseNoteSettings(
		java.lang.String integrateTracking,
		java.lang.String integrateMail,
		java.lang.String integrateCloud,
		java.lang.String domainId,
		java.lang.String operatorId,
		java.lang.String integrateCalendar
	) {
		this.integrateTracking = integrateTracking;
		this.integrateMail = integrateMail;
		this.integrateCloud = integrateCloud;
		this.domainId = domainId;
		this.operatorId = operatorId;
		this.integrateCalendar = integrateCalendar;
	}

	public java.lang.String getIntegrateTracking() {
		return this.integrateTracking;
	}

	public void setIntegrateTracking(java.lang.String integrateTracking) {
		this.integrateTracking = integrateTracking;
	}

	public java.lang.String getIntegrateMail() {
		return this.integrateMail;
	}

	public void setIntegrateMail(java.lang.String integrateMail) {
		this.integrateMail = integrateMail;
	}

	public java.lang.String getIntegrateCloud() {
		return this.integrateCloud;
	}

	public void setIntegrateCloud(java.lang.String integrateCloud) {
		this.integrateCloud = integrateCloud;
	}

	public java.lang.String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.String domainId) {
		this.domainId = domainId;
	}

	public java.lang.String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(java.lang.String operatorId) {
		this.operatorId = operatorId;
	}

	public java.lang.String getIntegrateCalendar() {
		return this.integrateCalendar;
	}

	public void setIntegrateCalendar(java.lang.String integrateCalendar) {
		this.integrateCalendar = integrateCalendar;
	}
}
