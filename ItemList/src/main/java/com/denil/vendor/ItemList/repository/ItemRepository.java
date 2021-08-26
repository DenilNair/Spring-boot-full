package com.denil.vendor.ItemList.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository

public interface ItemRepository extends JpaRepository<Items, Serializable  >,ItemRepositoryCustom {
	 
	//Items findByStockAvailable(int StockAvailable);
}
