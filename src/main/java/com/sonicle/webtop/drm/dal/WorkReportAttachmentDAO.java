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
import com.sonicle.webtop.drm.bol.OWorkReportAttachment;
import com.sonicle.webtop.drm.bol.OWorkReportRow;
import com.sonicle.webtop.drm.bol.OWorkType;
import static com.sonicle.webtop.drm.jooq.Tables.WORK_REPORTS_ATTACHMENTS;
import com.sonicle.webtop.drm.jooq.tables.records.WorkReportsAttachmentsRecord;
import com.sonicle.webtop.drm.jooq.tables.records.WorkReportsRowsRecord;
import com.sonicle.webtop.drm.jooq.tables.records.WorkTypesRecord;
import java.sql.Connection;
import java.util.List;
import org.jooq.DSLContext;

/**
 *
 * @author stfnnvl
 */
public class WorkReportAttachmentDAO extends BaseDAO {

	private final static WorkReportAttachmentDAO INSTANCE = new WorkReportAttachmentDAO();

	public static WorkReportAttachmentDAO getInstance() {
		return INSTANCE;
	}

	public List<OWorkReportAttachment> selectByWorkReport(Connection con, String workReportId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
				.select()
				.from(WORK_REPORTS_ATTACHMENTS)
				.where(
						WORK_REPORTS_ATTACHMENTS.WORK_REPORT_ID.equal(workReportId)
				)
				.fetchInto(OWorkReportAttachment.class);
	}
	
	public OWorkReportAttachment select(Connection con, String workReportAttachmentId) throws DAOException {
		DSLContext dsl = getDSL(con);
		return dsl
				.select()
				.from(WORK_REPORTS_ATTACHMENTS)
				.where(
						WORK_REPORTS_ATTACHMENTS.WORK_REPORT_ATTACHMENT_ID.equal(workReportAttachmentId)
				)
				.fetchOneInto(OWorkReportAttachment.class);
	}

	public int insert(Connection con, OWorkReportAttachment item) throws DAOException {
		DSLContext dsl = getDSL(con);

		WorkReportsAttachmentsRecord record = dsl.newRecord(WORK_REPORTS_ATTACHMENTS, item);

		return dsl
				.insertInto(WORK_REPORTS_ATTACHMENTS)
				.set(record)
				.execute();
	}

	public int deleteById(Connection con, String id) {
		DSLContext dsl = getDSL(con);

		return dsl
				.delete(WORK_REPORTS_ATTACHMENTS)
				.where(
						WORK_REPORTS_ATTACHMENTS.WORK_REPORT_ATTACHMENT_ID.equal(id)
				)
				.execute();
	}

}
