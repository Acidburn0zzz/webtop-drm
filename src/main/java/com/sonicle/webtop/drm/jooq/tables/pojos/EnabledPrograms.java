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
public class EnabledPrograms implements java.io.Serializable {

	private static final long serialVersionUID = 799518125;

	private java.lang.String  domainId;
	private java.lang.String  groupId;
	private java.lang.String  programId;
	private java.lang.String  parentId;
	private java.lang.Boolean readOnly;

	public EnabledPrograms() {}

	public EnabledPrograms(
		java.lang.String  domainId,
		java.lang.String  groupId,
		java.lang.String  programId,
		java.lang.String  parentId,
		java.lang.Boolean readOnly
	) {
		this.domainId = domainId;
		this.groupId = groupId;
		this.programId = programId;
		this.parentId = parentId;
		this.readOnly = readOnly;
	}

	public java.lang.String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.String domainId) {
		this.domainId = domainId;
	}

	public java.lang.String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(java.lang.String groupId) {
		this.groupId = groupId;
	}

	public java.lang.String getProgramId() {
		return this.programId;
	}

	public void setProgramId(java.lang.String programId) {
		this.programId = programId;
	}

	public java.lang.String getParentId() {
		return this.parentId;
	}

	public void setParentId(java.lang.String parentId) {
		this.parentId = parentId;
	}

	public java.lang.Boolean getReadOnly() {
		return this.readOnly;
	}

	public void setReadOnly(java.lang.Boolean readOnly) {
		this.readOnly = readOnly;
	}
}
