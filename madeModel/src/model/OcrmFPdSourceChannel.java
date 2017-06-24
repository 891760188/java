package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the OCRM_F_PD_SOURCE_CHANNELS database table.
 * 
 */
@Entity
@Table(name="OCRM_F_PD_SOURCE_CHANNELS")
public class OcrmFPdSourceChannel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String name;

	private String pid;

	private String remark1;

	public OcrmFPdSourceChannel() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRemark1() {
		return this.remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

}