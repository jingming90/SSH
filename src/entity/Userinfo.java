package entity;

import java.math.BigDecimal;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {


	private BigDecimal UId;
	private String UName;
	private String UPwd;


	public Userinfo() {
	}

	public Userinfo(BigDecimal UId) {
		this.UId = UId;
	}

	public Userinfo(BigDecimal UId, String UName, String UPwd) {
		this.UId = UId;
		this.UName = UName;
		this.UPwd = UPwd;
	}


	public BigDecimal getUId() {
		return this.UId;
	}

	public void setUId(BigDecimal UId) {
		this.UId = UId;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUPwd() {
		return this.UPwd;
	}

	public void setUPwd(String UPwd) {
		this.UPwd = UPwd;
	}

}