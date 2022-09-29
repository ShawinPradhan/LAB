package com.hiber;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {

	@Id
	private int bid;
	@Column(name="brand_name" , length=50)
	private String name;
	
	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
	List<Category> category;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public Brand(int bid, String name, List<Category> category) {
		super();
		this.bid = bid;
		this.name = name;
		this.category = category;
	}

	public Brand() {
		super();
	}

	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", name=" + name + "]";
	}
	
	
}

