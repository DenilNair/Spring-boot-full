package com.denil.vendor.ItemList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.denil.vendor.ItemList.service.Items;
import com.denil.vendor.ItemList.service.VendorService;


@RestController
@RequestMapping("home")
public class ListController {

	@Autowired
	VendorService vs;
	
	@GetMapping(path="/all")
	public  @ResponseBody Iterable<com.denil.vendor.ItemList.repository.Items> ListVendor() {
		return vs.getAllItems();
		//return "List All";
	}
	
	@GetMapping(path="/vendor/{id}")
	public String ListVendor(@PathVariable  int id) {
		return "List All "+id;
	}
	@GetMapping(path="/vendor/byName/{name}")
	public  @ResponseBody Iterable<com.denil.vendor.ItemList.repository.Items> ListVendorByName(@PathVariable  String name) {
		return vs.getAllItemByName(name);
	}
	
	@PostMapping(path="/addItem/name/{name}/price/{price}/stock/{stock}")
	public ResponseEntity<Object> addItem(@PathVariable String name,@PathVariable double price,@PathVariable Integer stock) {
		
		vs.addNewItem(name,price,stock);
		 return new ResponseEntity<>(
		          "New Record inserted", 
		          HttpStatus.CREATED);
	}
	/*
	
	@GetMapping(path="/stockAvailability/{stock}")
	public com.denil.vendor.ItemList.repository.Items findbyStock(@PathVariable int stock){
		return vs.findbyStock(stock);
	} 
	*/
	
}
