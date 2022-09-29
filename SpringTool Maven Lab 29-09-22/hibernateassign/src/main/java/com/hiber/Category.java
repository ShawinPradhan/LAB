package com.hiber;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "category.byname", query="from Category where cName=?1")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	
	@Column(name="cat_name", length=25)
	private String cName;
	
	@Column(name="no_of_items",length=10)
	private int nItems;
	
	@ManyToOne
	@JoinColumn(name="bid")
	private Brand brand;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getnItems() {
		return nItems;
	}

	public void setnItems(int nItems) {
		this.nItems = nItems;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category(int cId, String cName, int nItems, Brand brand) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.nItems = nItems;
		this.brand = brand;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [cId=" + cId + ", cName=" + cName + ", nItems=" + nItems + "]";
	}
	
	
}
