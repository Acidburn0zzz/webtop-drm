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
public class ExpenseNoteDocumentLinksRecord extends org.jooq.impl.TableRecordImpl<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteDocumentLinksRecord> implements org.jooq.Record4<java.math.BigInteger, java.math.BigInteger, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1459109098;

	/**
	 * Setter for <code>drm.expense_note_document_links.expense_note_id</code>.
	 */
	public void setExpenseNoteId(java.math.BigInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>drm.expense_note_document_links.expense_note_id</code>.
	 */
	public java.math.BigInteger getExpenseNoteId() {
		return (java.math.BigInteger) getValue(0);
	}

	/**
	 * Setter for <code>drm.expense_note_document_links.expense_note_document_id</code>.
	 */
	public void setExpenseNoteDocumentId(java.math.BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>drm.expense_note_document_links.expense_note_document_id</code>.
	 */
	public java.math.BigInteger getExpenseNoteDocumentId() {
		return (java.math.BigInteger) getValue(1);
	}

	/**
	 * Setter for <code>drm.expense_note_document_links.operator_id</code>.
	 */
	public void setOperatorId(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>drm.expense_note_document_links.operator_id</code>.
	 */
	public java.lang.String getOperatorId() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>drm.expense_note_document_links.domain_id</code>.
	 */
	public void setDomainId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>drm.expense_note_document_links.domain_id</code>.
	 */
	public java.lang.String getDomainId() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.math.BigInteger, java.math.BigInteger, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.math.BigInteger, java.math.BigInteger, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field1() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteDocumentLinks.EXPENSE_NOTE_DOCUMENT_LINKS.EXPENSE_NOTE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field2() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteDocumentLinks.EXPENSE_NOTE_DOCUMENT_LINKS.EXPENSE_NOTE_DOCUMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteDocumentLinks.EXPENSE_NOTE_DOCUMENT_LINKS.OPERATOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteDocumentLinks.EXPENSE_NOTE_DOCUMENT_LINKS.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value1() {
		return getExpenseNoteId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value2() {
		return getExpenseNoteDocumentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getOperatorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteDocumentLinksRecord value1(java.math.BigInteger value) {
		setExpenseNoteId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteDocumentLinksRecord value2(java.math.BigInteger value) {
		setExpenseNoteDocumentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteDocumentLinksRecord value3(java.lang.String value) {
		setOperatorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteDocumentLinksRecord value4(java.lang.String value) {
		setDomainId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteDocumentLinksRecord values(java.math.BigInteger value1, java.math.BigInteger value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExpenseNoteDocumentLinksRecord
	 */
	public ExpenseNoteDocumentLinksRecord() {
		super(com.sonicle.webtop.drm.jooq.tables.ExpenseNoteDocumentLinks.EXPENSE_NOTE_DOCUMENT_LINKS);
	}

	/**
	 * Create a detached, initialised ExpenseNoteDocumentLinksRecord
	 */
	public ExpenseNoteDocumentLinksRecord(java.math.BigInteger expenseNoteId, java.math.BigInteger expenseNoteDocumentId, java.lang.String operatorId, java.lang.String domainId) {
		super(com.sonicle.webtop.drm.jooq.tables.ExpenseNoteDocumentLinks.EXPENSE_NOTE_DOCUMENT_LINKS);

		setValue(0, expenseNoteId);
		setValue(1, expenseNoteDocumentId);
		setValue(2, operatorId);
		setValue(3, domainId);
	}
}