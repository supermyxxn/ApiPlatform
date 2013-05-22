package com.apinews.core.server.po;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "item")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Item implements Serializable {

	private String aaa;
	private String bbb;
	private String ccc;

	@Id
	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	@Column(unique=false, nullable=true)
	public String getBbb() {
		return bbb;
	}

	public void setBbb(String bbb) {
		this.bbb = bbb;
	}

	@Column(unique=false, nullable=true)
	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

}
