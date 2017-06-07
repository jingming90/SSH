package entity;

import java.math.BigDecimal;

/**
 * Categories entity. @author MyEclipse Persistence Tools
 */

public class Categories implements java.io.Serializable {

	private BigDecimal categoryid;
	private String categoryname;
	private String description;

	public Categories() {
	}

	public Categories(BigDecimal categoryid, String categoryname) {
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}

	public Categories(BigDecimal categoryid, String categoryname,
			String description) {
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.description = description;
	}

	// Property accessors

	public BigDecimal getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(BigDecimal categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}