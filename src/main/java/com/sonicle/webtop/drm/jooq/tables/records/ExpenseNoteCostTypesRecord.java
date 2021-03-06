/**
 * This class is generated by jOOQ
 */
package com.sonicle.webtop.drm.jooq.tables.records;

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
public class ExpenseNoteCostTypesRecord extends org.jooq.impl.UpdatableRecordImpl<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteCostTypesRecord> implements org.jooq.Record3<java.math.BigInteger, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -555405531;

	/**
	 * Setter for <code>drm.expense_note_cost_types.cost_type_id</code>.
	 */
	public void setCostTypeId(java.math.BigInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>drm.expense_note_cost_types.cost_type_id</code>.
	 */
	public java.math.BigInteger getCostTypeId() {
		return (java.math.BigInteger) getValue(0);
	}

	/**
	 * Setter for <code>drm.expense_note_cost_types.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>drm.expense_note_cost_types.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>drm.expense_note_cost_types.domain_id</code>.
	 */
	public void setDomainId(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>drm.expense_note_cost_types.domain_id</code>.
	 */
	public java.lang.String getDomainId() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.math.BigInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.math.BigInteger, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.math.BigInteger, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field1() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteCostTypes.EXPENSE_NOTE_COST_TYPES.COST_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteCostTypes.EXPENSE_NOTE_COST_TYPES.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteCostTypes.EXPENSE_NOTE_COST_TYPES.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value1() {
		return getCostTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteCostTypesRecord value1(java.math.BigInteger value) {
		setCostTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteCostTypesRecord value2(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteCostTypesRecord value3(java.lang.String value) {
		setDomainId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteCostTypesRecord values(java.math.BigInteger value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExpenseNoteCostTypesRecord
	 */
	public ExpenseNoteCostTypesRecord() {
		super(com.sonicle.webtop.drm.jooq.tables.ExpenseNoteCostTypes.EXPENSE_NOTE_COST_TYPES);
	}

	/**
	 * Create a detached, initialised ExpenseNoteCostTypesRecord
	 */
	public ExpenseNoteCostTypesRecord(java.math.BigInteger costTypeId, java.lang.String description, java.lang.String domainId) {
		super(com.sonicle.webtop.drm.jooq.tables.ExpenseNoteCostTypes.EXPENSE_NOTE_COST_TYPES);

		setValue(0, costTypeId);
		setValue(1, description);
		setValue(2, domainId);
	}
}
