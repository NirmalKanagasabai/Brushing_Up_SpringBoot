package com.nimbus.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	private int itemID;
	private String itemName;
	private String itemCompany;
	private String itemCategory;
	private long itemPrice;
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCompany() {
		return itemCompany;
	}
	public void setItemCompany(String itemCompany) {
		this.itemCompany = itemCompany;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public long getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(long itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", itemCompany=" + itemCompany + ", itemCategory="
				+ itemCategory + ", itemPrice=" + itemPrice + "]";
	}
	
	

}
