package com.nimbus.demo.itemRepo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nimbus.demo.model.Item;

public interface ItemRepo extends CrudRepository<Item, Integer> {
	List<Item> findByItemCompany(String itemCompany);
	
	List<Item> findByItemPriceGreaterThan(long itemPrice);
	
	@Query("from Item where itemCategory=?1 order by itemName")
	List<Item> findByItemCategorySorted(String itemCategory);
}
