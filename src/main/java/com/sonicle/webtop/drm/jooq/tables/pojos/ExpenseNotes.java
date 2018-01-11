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
public class ExpenseNotes implements java.io.Serializable {

	private static final long serialVersionUID = -826628180;

	private java.math.BigInteger   expenseNoteId;
	private java.lang.String       currency;
	private java.math.BigDecimal   amountkm;
	private java.math.BigDecimal   subtotal;
	private java.math.BigDecimal   advance;
	private java.math.BigDecimal   total;
	private java.lang.String       operatorId;
	private java.lang.String       status;
	private java.lang.String       domainId;
	private java.lang.String       sign;
	private org.joda.time.DateTime fromDate;
	private org.joda.time.DateTime toDate;
	private java.math.BigInteger   companyId;
	private java.lang.String       description;
	private java.lang.String       statusd;

	public ExpenseNotes() {}

	public ExpenseNotes(
		java.math.BigInteger   expenseNoteId,
		java.lang.String       currency,
		java.math.BigDecimal   amountkm,
		java.math.BigDecimal   subtotal,
		java.math.BigDecimal   advance,
		java.math.BigDecimal   total,
		java.lang.String       operatorId,
		java.lang.String       status,
		java.lang.String       domainId,
		java.lang.String       sign,
		org.joda.time.DateTime fromDate,
		org.joda.time.DateTime toDate,
		java.math.BigInteger   companyId,
		java.lang.String       description,
		java.lang.String       statusd
	) {
		this.expenseNoteId = expenseNoteId;
		this.currency = currency;
		this.amountkm = amountkm;
		this.subtotal = subtotal;
		this.advance = advance;
		this.total = total;
		this.operatorId = operatorId;
		this.status = status;
		this.domainId = domainId;
		this.sign = sign;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.companyId = companyId;
		this.description = description;
		this.statusd = statusd;
	}

	public java.math.BigInteger getExpenseNoteId() {
		return this.expenseNoteId;
	}

	public void setExpenseNoteId(java.math.BigInteger expenseNoteId) {
		this.expenseNoteId = expenseNoteId;
	}

	public java.lang.String getCurrency() {
		return this.currency;
	}

	public void setCurrency(java.lang.String currency) {
		this.currency = currency;
	}

	public java.math.BigDecimal getAmountkm() {
		return this.amountkm;
	}

	public void setAmountkm(java.math.BigDecimal amountkm) {
		this.amountkm = amountkm;
	}

	public java.math.BigDecimal getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(java.math.BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public java.math.BigDecimal getAdvance() {
		return this.advance;
	}

	public void setAdvance(java.math.BigDecimal advance) {
		this.advance = advance;
	}

	public java.math.BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(java.math.BigDecimal total) {
		this.total = total;
	}

	public java.lang.String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(java.lang.String operatorId) {
		this.operatorId = operatorId;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.String domainId) {
		this.domainId = domainId;
	}

	public java.lang.String getSign() {
		return this.sign;
	}

	public void setSign(java.lang.String sign) {
		this.sign = sign;
	}

	public org.joda.time.DateTime getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(org.joda.time.DateTime fromDate) {
		this.fromDate = fromDate;
	}

	public org.joda.time.DateTime getToDate() {
		return this.toDate;
	}

	public void setToDate(org.joda.time.DateTime toDate) {
		this.toDate = toDate;
	}

	public java.math.BigInteger getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(java.math.BigInteger companyId) {
		this.companyId = companyId;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getStatusd() {
		return this.statusd;
	}

	public void setStatusd(java.lang.String statusd) {
		this.statusd = statusd;
	}
}
