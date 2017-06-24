package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MOBILE_ROLE_MODULE database table.
 * 
 */
@Entity
@Table(name="MOBILE_ROLE_MODULE")
public class MobileRoleModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="MODEL_ID")
	private BigDecimal modelId;

	@Column(name="ROLE_ID")
	private BigDecimal roleId;

	public MobileRoleModule() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getModelId() {
		return this.modelId;
	}

	public void setModelId(BigDecimal modelId) {
		this.modelId = modelId;
	}

	public BigDecimal getRoleId() {
		return this.roleId;
	}

	public void setRoleId(BigDecimal roleId) {
		this.roleId = roleId;
	}

}