package com.stms.store.management.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")

public class Item {

	@Column(name = "itemId")
	@Id
	private int itemId;

	@Column(name = "itemName")
	private String itemName;

	@Column(name = "category")
	private String category;

	@Column(name = "date")
	private String date;

	@Column(name = "status")
	private String status;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Item(int itemId, String itemName, String category, String date, String status) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.date = date;
		this.status = status;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", date=" + date
				+ ", status=" + status + "]";
	}
	
	

}
