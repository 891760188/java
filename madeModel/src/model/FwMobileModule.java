package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FW_MOBILE_MODULE database table.
 * 
 */
@Entity
@Table(name="FW_MOBILE_MODULE")
public class FwMobileModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String cls;

	@Temporal(TemporalType.DATE)
	@Column(name="CRT_DATE")
	private Date crtDate;

	private String fun;

	private String icon;

	@Column(name="MDUL_TEXT")
	private String mdulText;

	@Column(name="MDUL_TYPE")
	private String mdulType;

	private String url;

	public FwMobileModule() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCls() {
		return this.cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public Date getCrtDate() {
		return this.crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	public String getFun() {
		return this.fun;
	}

	public void setFun(String fun) {
		this.fun = fun;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMdulText() {
		return this.mdulText;
	}

	public void setMdulText(String mdulText) {
		this.mdulText = mdulText;
	}

	public String getMdulType() {
		return this.mdulType;
	}

	public void setMdulType(String mdulType) {
		this.mdulType = mdulType;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}