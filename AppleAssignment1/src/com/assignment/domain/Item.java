package com.assignment.domain;
/*Domain class for Item Objects*/
public class Item {
	private String itemName;
	private int itemCount=0;
	
	public Item(String itemName) {
		super();
		this.itemName = itemName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemCount=" + itemCount + "]";
	}
	public void increaseCount() {
		this.itemCount++;
	}
}
