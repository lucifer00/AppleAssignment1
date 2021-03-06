package com.assignment.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.assignment.domain.Item;
import com.assignment.domain.Order;

public class MainApp {
	public static void main(String[] args)  {
		Item item1=new Item("item1");
		Item item2=new Item("item2");
		Item item3=new Item("item3");
		List<Item> itemList=new ArrayList<>();	//List to hold Items
		List<Order> orderList=new ArrayList<>();	//List to hold Orders
		/*Items and Order lists are populated manually to show the functionality*/
		itemList.addAll(Arrays.asList(item1,item2,item3));
		Order order1=new Order("Order1");
		order1.getItemsOrder().addAll(Arrays.asList(item1,item2));
		Order order2=new Order("Order2");
		order2.getItemsOrder().addAll(Arrays.asList(item3));
		Order order3=new Order("Order3");
		order3.getItemsOrder().addAll(Arrays.asList(item2));
		Order order4=new Order("Order4");
		order4.getItemsOrder().addAll(Arrays.asList(item1,item2));
		orderList.addAll(Arrays.asList(order1,order2,order3,order4));
		/*Iterating over orders and incrementing the item use counter*/
		orderList.forEach(order->{
			order.getItemsOrder().forEach(item->item.increaseCount());
		});
		Collections.sort(itemList, (o1,o2)->o2.getItemCount()-o1.getItemCount());
		/*Filtering out Orders for the highest and second highest frequency Items*/
		List<Order> ordersItemHighestFrequency=orderList.stream().filter(order->order.getItemsOrder().contains(itemList.get(0))).collect(Collectors.toList());
		List<Order> ordersItemSecondFrequency=orderList.stream().filter(order->order.getItemsOrder().contains(itemList.get(1))).collect(Collectors.toList());
		/*Printing out the items with frequency and related orders.*/
		System.out.print(itemList.get(0).getItemName()+"--> usageCount:"+itemList.get(0).getItemCount()+";"
		+"corresponding Orders: ");
		ordersItemHighestFrequency.forEach(o->System.out.print(o.getOrderName()+" "));
		System.out.println();
		System.out.print(itemList.get(1).getItemName()+"--> usageCount:"+itemList.get(1).getItemCount()+";"
				+"corresponding Orders: ");
				ordersItemSecondFrequency.forEach(o->System.out.print(o.getOrderName()+" "));
	}
}
