/*
 * Copyright (C) 2017 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2017 Sonicle S.r.l.".
 */
package com.sonicle.webtop.drm.dal;

import com.sonicle.webtop.core.dal.BaseDAO;
import com.sonicle.webtop.core.dal.DAOException;
import com.sonicle.webtop.drm.WorkReportQuery;
import com.sonicle.webtop.drm.bol.OWorkReport;
import com.sonicle.webtop.drm.jooq.Sequences;
import static com.sonicle.webtop.drm.jooq.Tables.WORK_REPORTS;
import com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRecord;
import java.sql.Connection;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.DatePart;

/**
 *
 * @author stfnnvl
 */
public class WorkReportDAO extends BaseDAO {

	private final static WorkReportDAO INSTANCE = new WorkReportDAO();

	public static WorkReportDAO getInstance() {
		return INSTANCE;
	}

	public int insert(Connection con, OWorkReport item, DateTime revisionTimestamp) throws DAOException {
		DSLContext dsl = getDSL(con);

		item.setRevisionStatus(OWorkReport.REV_STATUS_NEW);
		item.setRevisionTimestamp(revisionTimestamp);
		item.setRevisionSequence(0);

		WorkReportsRecord record = dsl.newRecord(WORK_REPORTS, item);
		return dsl
				.insertInto(WORK_REPORTS)
				.set(record)
				.execute();
	}

	public List<OWorkReport> selectWorkReports(Connection con, WorkReportQuery query) throws DAOException {
		DSLContext dsl = getDSL(con);

		Condition searchCndt = ensureCondition(query);

		return dsl
				.select()
				.from(WORK_REPORTS)
				.where(
						WORK_REPORTS.REVISION_STATUS.equal(OWorkReport.REV_STATUS_NEW)
						.or(WORK_REPORTS.REVISION_STATUS.equal(OWorkReport.REV_STATUS_MODIFIED))
						.and(searchCndt)
				)
				.fetchInto(OWorkReport.class);
	}

	public OWorkReport selectById(Connection con, String workReportId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
				.select()
				.from(WORK_REPORTS)
				.where(WORK_REPORTS.WORK_REPORT_ID.equal(workReportId))
				.fetchOneInto(OWorkReport.class);
	}

	public int update(Connection con, OWorkReport item, DateTime revisionTimestamp) throws DAOException {
		DSLContext dsl = getDSL(con);
		item.setRevisionStatus(OWorkReport.REV_STATUS_MODIFIED);
		item.setRevisionTimestamp(revisionTimestamp);
		return dsl
				.update(WORK_REPORTS)
				.set(WORK_REPORTS.WORK_REPORT_NO, item.getWorkReportNo())
				.set(WORK_REPORTS.COMPANY_ID, item.getCompanyId())
				.set(WORK_REPORTS.USER_ID, item.getUserId())
				.set(WORK_REPORTS.REVISION_STATUS, item.getRevisionStatus())
				.set(WORK_REPORTS.REVISION_TIMESTAMP, item.getRevisionTimestamp())
				.set(WORK_REPORTS.REVISION_SEQUENCE, item.getRevisionSequence())
				.set(WORK_REPORTS.DOC_STATUS_ID, item.getDocStatusId())
				.set(WORK_REPORTS.CONTACT_ID, item.getContactId())
				.set(WORK_REPORTS.CUSTOMER_ID, item.getCustomerId())
				.set(WORK_REPORTS.CUSTOMER_STAT_ID, item.getCustomerStatId())
				.set(WORK_REPORTS.CONTACT_ID, item.getContactId())
				.set(WORK_REPORTS.FROM_DATE, item.getFromDate())
				.set(WORK_REPORTS.TO_DATE, item.getToDate())
				.set(WORK_REPORTS.REFERENCE_NO, item.getReferenceNo())
				.set(WORK_REPORTS.CAUSAL, item.getCausal())
				.set(WORK_REPORTS.CAUSAL_ID, item.getCausalId())
				.set(WORK_REPORTS.DDT_NO, item.getDdtNo())
				.set(WORK_REPORTS.DDT_DATE, item.getDdtDate())
				.set(WORK_REPORTS.NOTES, item.getNotes())
				.set(WORK_REPORTS.DESCRIPTION, item.getDescription())
				.set(WORK_REPORTS.APPLY_SIGNATURE, item.getApplySignature())
				.set(WORK_REPORTS.CHARGE_TO, item.getChargeTo())
				.set(WORK_REPORTS.FREE_SUPPORT, item.getFreeSupport())
				.set(WORK_REPORTS.BUSINESS_TRIP_ID, item.getBusinessTripId())
				.set(WORK_REPORTS.DAY_TRASFERT, item.getDayTrasfert())
				.where(
						WORK_REPORTS.WORK_REPORT_ID.equal(item.getWorkReportId())
				)
				.execute();
	}

	public int deleteById(Connection con, String workReportId) {
		DSLContext dsl = getDSL(con);
		return dsl
				.delete(WORK_REPORTS)
				.where(
						WORK_REPORTS.WORK_REPORT_ID.equal(workReportId)
				)
				.execute();
	}

	public int logicalDelete(Connection con, String workReportId, DateTime revisionTimestamp) {
		DSLContext dsl = getDSL(con);
		return dsl
				.update(WORK_REPORTS)
				.set(WORK_REPORTS.REVISION_STATUS, OWorkReport.REV_STATUS_DELETED)
				.set(WORK_REPORTS.REVISION_TIMESTAMP, revisionTimestamp)
				.where(
						WORK_REPORTS.WORK_REPORT_ID.equal(workReportId)
				)
				.execute();
	}

	public Long getWorkReportSequence(Connection con) throws DAOException {
		DSLContext dsl = getDSL(con);
		Long nextID = dsl.nextval(Sequences.SEQ_WORK_REPORTS_COUNT);
		return nextID;
	}

	private Condition ensureCondition(WorkReportQuery query) {

		Condition searchCndt = WORK_REPORTS.COMPANY_ID.equal(query.companyId);
		
		if (!StringUtils.isEmpty(query.userId)) {
			searchCndt = searchCndt.and(WORK_REPORTS.USER_ID.like(query.userId));
		}
		
		if (!StringUtils.isEmpty(query.workReportNo)) {
			searchCndt = searchCndt.and(WORK_REPORTS.WORK_REPORT_NO.like(query.workReportNo));
		}

		if (query.year != null) {
			searchCndt = searchCndt.and(WORK_REPORTS.FROM_DATE.extract(DatePart.YEAR).equal(query.year));
		}

		if (!StringUtils.isEmpty(query.customerId)) {
			searchCndt = searchCndt.and(WORK_REPORTS.CUSTOMER_ID.like(query.customerId));
		}

		if (query.fromDate != null) {
			searchCndt = searchCndt.and(WORK_REPORTS.FROM_DATE.equal(query.fromDate));
		}

		if (query.toDate != null) {
			searchCndt = searchCndt.and(WORK_REPORTS.TO_DATE.equal(query.toDate));
		}

		if (query.causalId != null) {
			searchCndt = searchCndt.and(WORK_REPORTS.CAUSAL_ID.equal(query.causalId));
		}

		if (!StringUtils.isEmpty(query.referenceNo)) {
			searchCndt = searchCndt.and(WORK_REPORTS.REFERENCE_NO.like(query.referenceNo));
		}

		if (query.businessTripId != null) {
			searchCndt = searchCndt.and(WORK_REPORTS.BUSINESS_TRIP_ID.equal(query.businessTripId));
		}

		if (!StringUtils.isEmpty(query.description)) {
			searchCndt = searchCndt.and(WORK_REPORTS.DESCRIPTION.like(query.description));
		}

		if (!StringUtils.isEmpty(query.notes)) {
			searchCndt = searchCndt.and(WORK_REPORTS.NOTES.like(query.notes));
		}
		if (query.docStatusId != null) {
			searchCndt = searchCndt.and(WORK_REPORTS.DOC_STATUS_ID.equal(query.docStatusId));
		}

		if (query.chargeTo != null) {
			searchCndt = searchCndt.and(WORK_REPORTS.CHARGE_TO.equal(query.chargeTo));
		}

		return searchCndt;
	}
}