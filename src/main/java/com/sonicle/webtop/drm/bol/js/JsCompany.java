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
package com.sonicle.webtop.drm.bol.js;

import com.sonicle.webtop.drm.bol.OCompany;
import com.sonicle.webtop.drm.model.Company;
import com.sonicle.webtop.drm.model.CompanyUserAssociation;
import com.sonicle.webtop.drm.model.DocStatusGroupAssociation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stfnnvl
 */
public class JsCompany {

	public Integer companyId;
	public String domainId;
	public String name;
	public String address;
	public String postalCode;
	public String city;
	public String state;
	public String phone;
	public String fax;
	public String vat;
	public String taxCode;
	public String rea;
	public String businessRegister;
	public String logoUploadId;
	public String footerColumns;
	public String footerColumnLeft;
	public String footerColumnRight;

	public List<CompanyUserAssociation> associatedUsers = new ArrayList();

	public JsCompany(Company company) {
		this.companyId = company.getCompanyId();
		this.domainId = company.getDomainId();
		this.name = company.getName();
		this.address = company.getAddress();
		this.postalCode = company.getPostalCode();
		this.city = company.getCity();
		this.state = company.getState();
		this.phone = company.getPhone();
		this.fax = company.getFax();
		this.vat = company.getVat();
		this.taxCode = company.getTaxCode();
		this.rea = company.getRea();
		this.businessRegister = company.getBusinessRegister();
		this.logoUploadId = company.getLogoUploadId();
		this.footerColumns = company.getFooterColumns();
		this.footerColumnLeft = company.getFooterColumnLeft();
		this.footerColumnRight = company.getFooterColumnRight();
		
		this.associatedUsers = company.getAssociatedUsers();
	}

	public static Company createCompany(JsCompany js) {

		Company newCompany = new Company();

		newCompany.setCompanyId(js.companyId);
		newCompany.setDomainId(js.domainId);
		newCompany.setName(js.name);
		newCompany.setAddress(js.address);
		newCompany.setPostalCode(js.postalCode);
		newCompany.setCity(js.city);
		newCompany.setState(js.state);
		newCompany.setPhone(js.phone);
		newCompany.setFax(js.fax);
		newCompany.setVat(js.vat);
		newCompany.setTaxCode(js.taxCode);
		newCompany.setRea(js.rea);
		newCompany.setBusinessRegister(js.businessRegister);
		newCompany.setLogoUploadId(js.logoUploadId);
		newCompany.setFooterColumns(js.footerColumns);
		newCompany.setFooterColumnLeft(js.footerColumnLeft);
		newCompany.setFooterColumnRight(js.footerColumnRight);

		newCompany.setAssociatedUsers(js.associatedUsers);
		
		return newCompany;
	}
}