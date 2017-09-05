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
public class Folders extends org.jooq.impl.TableImpl<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord> {

	private static final long serialVersionUID = 2044481759;

	/**
	 * The reference instance of <code>drm.folders</code>
	 */
	public static final com.sonicle.webtop.drm.jooq.tables.Folders FOLDERS = new com.sonicle.webtop.drm.jooq.tables.Folders();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord> getRecordType() {
		return com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord.class;
	}

	/**
	 * The column <code>drm.folders.folder_id</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord, java.lang.String> FOLDER_ID = createField("folder_id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>drm.folders.name</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>drm.folders.description</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>drm.folders.expired</code>.
	 */
	public final org.jooq.TableField<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord, java.lang.Boolean> EXPIRED = createField("expired", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>drm.folders</code> table reference
	 */
	public Folders() {
		this("folders", null);
	}

	/**
	 * Create an aliased <code>drm.folders</code> table reference
	 */
	public Folders(java.lang.String alias) {
		this(alias, com.sonicle.webtop.drm.jooq.tables.Folders.FOLDERS);
	}

	private Folders(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Folders(java.lang.String alias, org.jooq.Table<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.sonicle.webtop.drm.jooq.Drm.DRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord> getPrimaryKey() {
		return com.sonicle.webtop.drm.jooq.Keys.FOLDERS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.sonicle.webtop.drm.jooq.tables.records.FoldersRecord>>asList(com.sonicle.webtop.drm.jooq.Keys.FOLDERS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.sonicle.webtop.drm.jooq.tables.Folders as(java.lang.String alias) {
		return new com.sonicle.webtop.drm.jooq.tables.Folders(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.sonicle.webtop.drm.jooq.tables.Folders rename(java.lang.String name) {
		return new com.sonicle.webtop.drm.jooq.tables.Folders(name, null);
	}
}
