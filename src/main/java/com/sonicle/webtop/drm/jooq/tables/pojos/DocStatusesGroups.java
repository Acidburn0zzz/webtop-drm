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
public class DocStatusesGroups implements java.io.Serializable {

	private static final long serialVersionUID = -1619569321;

	private java.lang.Integer associationId;
	private java.lang.Integer docStatusId;
	private java.lang.String  groupId;

	public DocStatusesGroups() {}

	public DocStatusesGroups(
		java.lang.Integer associationId,
		java.lang.Integer docStatusId,
		java.lang.String  groupId
	) {
		this.associationId = associationId;
		this.docStatusId = docStatusId;
		this.groupId = groupId;
	}

	public java.lang.Integer getAssociationId() {
		return this.associationId;
	}

	public void setAssociationId(java.lang.Integer associationId) {
		this.associationId = associationId;
	}

	public java.lang.Integer getDocStatusId() {
		return this.docStatusId;
	}

	public void setDocStatusId(java.lang.Integer docStatusId) {
		this.docStatusId = docStatusId;
	}

	public java.lang.String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(java.lang.String groupId) {
		this.groupId = groupId;
	}
}
