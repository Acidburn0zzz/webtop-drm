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
public class ExpenseNoteRowsRecord extends org.jooq.impl.UpdatableRecordImpl<com.sonicle.webtop.drm.jooq.tables.records.ExpenseNoteRowsRecord> implements org.jooq.Record20<java.math.BigInteger, java.math.BigInteger, org.joda.time.DateTime, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, org.joda.time.DateTime, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1599731917;

	/**
	 * Setter for <code>drm.expense_note_rows.expense_note_row_id</code>.
	 */
	public void setExpenseNoteRowId(java.math.BigInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.expense_note_row_id</code>.
	 */
	public java.math.BigInteger getExpenseNoteRowId() {
		return (java.math.BigInteger) getValue(0);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.expense_note_id</code>.
	 */
	public void setExpenseNoteId(java.math.BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.expense_note_id</code>.
	 */
	public java.math.BigInteger getExpenseNoteId() {
		return (java.math.BigInteger) getValue(1);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.revision</code>.
	 */
	public void setRevision(org.joda.time.DateTime value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.revision</code>.
	 */
	public org.joda.time.DateTime getRevision() {
		return (org.joda.time.DateTime) getValue(2);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.km</code>.
	 */
	public void setKm(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.km</code>.
	 */
	public java.math.BigDecimal getKm() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.stay</code>.
	 */
	public void setStay(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.stay</code>.
	 */
	public java.math.BigDecimal getStay() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.highway</code>.
	 */
	public void setHighway(java.math.BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.highway</code>.
	 */
	public java.math.BigDecimal getHighway() {
		return (java.math.BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.park</code>.
	 */
	public void setPark(java.math.BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.park</code>.
	 */
	public java.math.BigDecimal getPark() {
		return (java.math.BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.meals</code>.
	 */
	public void setMeals(java.math.BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.meals</code>.
	 */
	public java.math.BigDecimal getMeals() {
		return (java.math.BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.amount_km</code>.
	 */
	public void setAmountKm(java.math.BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.amount_km</code>.
	 */
	public java.math.BigDecimal getAmountKm() {
		return (java.math.BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.other</code>.
	 */
	public void setOther(java.math.BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.other</code>.
	 */
	public java.math.BigDecimal getOther() {
		return (java.math.BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.total</code>.
	 */
	public void setTotal(java.math.BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.total</code>.
	 */
	public java.math.BigDecimal getTotal() {
		return (java.math.BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.date</code>.
	 */
	public void setDate(org.joda.time.DateTime value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.date</code>.
	 */
	public org.joda.time.DateTime getDate() {
		return (org.joda.time.DateTime) getValue(12);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.operator_id</code>.
	 */
	public void setOperatorId(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.operator_id</code>.
	 */
	public java.lang.String getOperatorId() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.domain_id</code>.
	 */
	public void setDomainId(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.domain_id</code>.
	 */
	public java.lang.String getDomainId() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.customer_id</code>.
	 */
	public void setCustomerId(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.customer_id</code>.
	 */
	public java.lang.String getCustomerId() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.payment_company</code>.
	 */
	public void setPaymentCompany(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.payment_company</code>.
	 */
	public java.lang.String getPaymentCompany() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.invoice</code>.
	 */
	public void setInvoice(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.invoice</code>.
	 */
	public java.lang.String getInvoice() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.invoice_number</code>.
	 */
	public void setInvoiceNumber(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.invoice_number</code>.
	 */
	public java.lang.String getInvoiceNumber() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>drm.expense_note_rows.point_of_sale</code>.
	 */
	public void setPointOfSale(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>drm.expense_note_rows.point_of_sale</code>.
	 */
	public java.lang.String getPointOfSale() {
		return (java.lang.String) getValue(19);
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
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<java.math.BigInteger, java.math.BigInteger, org.joda.time.DateTime, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, org.joda.time.DateTime, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<java.math.BigInteger, java.math.BigInteger, org.joda.time.DateTime, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, org.joda.time.DateTime, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field1() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.EXPENSE_NOTE_ROW_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field2() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.EXPENSE_NOTE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field3() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.REVISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.KM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.STAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field7() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.HIGHWAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field8() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.PARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field9() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.MEALS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field10() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.AMOUNT_KM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field11() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.OTHER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field12() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field13() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.OPERATOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.CUSTOMER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.PAYMENT_COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.INVOICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field19() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.INVOICE_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field20() {
		return com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS.POINT_OF_SALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value1() {
		return getExpenseNoteRowId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value2() {
		return getExpenseNoteId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value3() {
		return getRevision();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getKm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getStay();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value7() {
		return getHighway();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value8() {
		return getPark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value9() {
		return getMeals();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value10() {
		return getAmountKm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value11() {
		return getOther();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value12() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value13() {
		return getDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getOperatorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getCustomerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getPaymentCompany();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getInvoice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value19() {
		return getInvoiceNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value20() {
		return getPointOfSale();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value1(java.math.BigInteger value) {
		setExpenseNoteRowId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value2(java.math.BigInteger value) {
		setExpenseNoteId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value3(org.joda.time.DateTime value) {
		setRevision(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value4(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value5(java.math.BigDecimal value) {
		setKm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value6(java.math.BigDecimal value) {
		setStay(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value7(java.math.BigDecimal value) {
		setHighway(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value8(java.math.BigDecimal value) {
		setPark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value9(java.math.BigDecimal value) {
		setMeals(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value10(java.math.BigDecimal value) {
		setAmountKm(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value11(java.math.BigDecimal value) {
		setOther(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value12(java.math.BigDecimal value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value13(org.joda.time.DateTime value) {
		setDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value14(java.lang.String value) {
		setOperatorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value15(java.lang.String value) {
		setDomainId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value16(java.lang.String value) {
		setCustomerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value17(java.lang.String value) {
		setPaymentCompany(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value18(java.lang.String value) {
		setInvoice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value19(java.lang.String value) {
		setInvoiceNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord value20(java.lang.String value) {
		setPointOfSale(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExpenseNoteRowsRecord values(java.math.BigInteger value1, java.math.BigInteger value2, org.joda.time.DateTime value3, java.lang.String value4, java.math.BigDecimal value5, java.math.BigDecimal value6, java.math.BigDecimal value7, java.math.BigDecimal value8, java.math.BigDecimal value9, java.math.BigDecimal value10, java.math.BigDecimal value11, java.math.BigDecimal value12, org.joda.time.DateTime value13, java.lang.String value14, java.lang.String value15, java.lang.String value16, java.lang.String value17, java.lang.String value18, java.lang.String value19, java.lang.String value20) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExpenseNoteRowsRecord
	 */
	public ExpenseNoteRowsRecord() {
		super(com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS);
	}

	/**
	 * Create a detached, initialised ExpenseNoteRowsRecord
	 */
	public ExpenseNoteRowsRecord(java.math.BigInteger expenseNoteRowId, java.math.BigInteger expenseNoteId, org.joda.time.DateTime revision, java.lang.String description, java.math.BigDecimal km, java.math.BigDecimal stay, java.math.BigDecimal highway, java.math.BigDecimal park, java.math.BigDecimal meals, java.math.BigDecimal amountKm, java.math.BigDecimal other, java.math.BigDecimal total, org.joda.time.DateTime date, java.lang.String operatorId, java.lang.String domainId, java.lang.String customerId, java.lang.String paymentCompany, java.lang.String invoice, java.lang.String invoiceNumber, java.lang.String pointOfSale) {
		super(com.sonicle.webtop.drm.jooq.tables.ExpenseNoteRows.EXPENSE_NOTE_ROWS);

		setValue(0, expenseNoteRowId);
		setValue(1, expenseNoteId);
		setValue(2, revision);
		setValue(3, description);
		setValue(4, km);
		setValue(5, stay);
		setValue(6, highway);
		setValue(7, park);
		setValue(8, meals);
		setValue(9, amountKm);
		setValue(10, other);
		setValue(11, total);
		setValue(12, date);
		setValue(13, operatorId);
		setValue(14, domainId);
		setValue(15, customerId);
		setValue(16, paymentCompany);
		setValue(17, invoice);
		setValue(18, invoiceNumber);
		setValue(19, pointOfSale);
	}
}
