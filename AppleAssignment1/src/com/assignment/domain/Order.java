package com.assignment.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderName;
	public Order(String orderName) {
		super();
		this.orderName = orderName;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	private List<Item> itemsOrder=new ArrayList<>();

	public List<Item> getItemsOrder() {
		return itemsOrder;
	}

	public void setItemsOrder(List<Item> itemsOrder) {
		this.itemsOrder = itemsOrder;
	}
}
