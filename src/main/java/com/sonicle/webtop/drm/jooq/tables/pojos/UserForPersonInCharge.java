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
public class UserForPersonInCharge implements java.io.Serializable {

	private static final long serialVersionUID = 891926283;

	private java.lang.Integer id;
	private java.lang.String  domainId;
	private java.lang.Integer personInChargeId;
	private java.lang.String  userId;

	public UserForPersonInCharge() {}

	public UserForPersonInCharge(
		java.lang.Integer id,
		java.lang.String  domainId,
		java.lang.Integer personInChargeId,
		java.lang.String  userId
	) {
		this.id = id;
		this.domainId = domainId;
		this.personInChargeId = personInChargeId;
		this.userId = userId;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.String domainId) {
		this.domainId = domainId;
	}

	public java.lang.Integer getPersonInChargeId() {
		return this.personInChargeId;
	}

	public void setPersonInChargeId(java.lang.Integer personInChargeId) {
		this.personInChargeId = personInChargeId;
	}

	public java.lang.String getUserId() {
		return this.userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}
}
