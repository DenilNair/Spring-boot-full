package com.denil.vendor.ItemList.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itemDetails")
public class Items {

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public Items(String productName, double productPrice, int stockAvailable) {
		super();
		
		ProductName = productName;
		ProductPrice = productPrice;
		StockAvailable = stockAvailable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
	public int getStockAvailable() {
		return StockAvailable;
	}
	public void setStockAvailable(int stockAvailable) {
		StockAvailable = stockAvailable;
	}
	private String ProductName;
	private double ProductPrice;
	private int StockAvailable;
	
}
