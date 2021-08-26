package com.denil.vendor.ItemList.repository;

import java.util.List;

public interface ItemRepositoryCustom  {

	public List<Items> findByProductName(String name); 

}
