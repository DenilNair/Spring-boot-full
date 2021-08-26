package com.denil.vendor.ItemList.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.denil.vendor.ItemList.repository.Items;

import com.denil.vendor.ItemList.repository.ItemRepository;

@Component
public class VendorService {

	@Autowired
	ItemRepository itemRep;
	public List<Items> getAllItems() {
		//List <Items> l1=new ArrayList<Items>();
		//Items i1=new Items(0, null, 0, 0, null);
		//l1.add(i1);
		return itemRep.findAll();
		//return l1;
	}
	
	public List<Items> getAllItemByName(String name) {
		List <Items> l1=new ArrayList<Items>();
		///Items i1=new Items(0, null, 0, 0, null);
		return itemRep.findByProductName(name);}
		
	//}
	
	public void addNewItem(String name,double price,int Qty) {
		itemRep.save(new Items(name, price, Qty));
	}
	/*
	public Items findbyStock(int i) {
		return itemRep.findByStockAvailable(i);
	}
	*/
	
}
//