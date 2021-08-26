package com.denil.vendor.ItemList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.denil.vendor.ItemList.controller.ListController;

@SpringBootApplication
public class ItemListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemListApplication.class, args);
	}

}
