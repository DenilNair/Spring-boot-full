package com.denil.vendor.ItemList.service;

public class Items {
 private int id;
 private String ProductName;
 private int StockAvailable;
 private double  Price;
 private String avaiablePlaces;
public int getId() {
	return id;
}
public Items(int id, String productName, int stockAvailable, double price, String avaiablePlaces) {
	super();
	this.id = id;
	ProductName = productName;
	StockAvailable = stockAvailable;
	Price = price;
	this.avaiablePlaces = avaiablePlaces;
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
public int getStockAvailable() {
	return StockAvailable;
}
public void setStockAvailable(int stockAvailable) {
	StockAvailable = stockAvailable;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public String getAvaiablePlaces() {
	return avaiablePlaces;
}
public void setAvaiablePlaces(String avaiablePlaces) {
	this.avaiablePlaces = avaiablePlaces;
}
}
