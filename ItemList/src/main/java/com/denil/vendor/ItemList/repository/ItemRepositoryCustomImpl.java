package com.denil.vendor.ItemList.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional()
public class ItemRepositoryCustomImpl implements ItemRepositoryCustom {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Items> findByProductName(String name){
		 Query query = em.createNativeQuery("SELECT em.* FROM denil.item_details as em " +
	                "WHERE em.product_name LIKE ?", Items.class);
	        query.setParameter(1, name + "%");

	        List<Items> resultList = query.getResultList();
			return resultList;
	}
	
}
