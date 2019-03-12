package com.nimbus.demo.itemRepo;

import org.springframework.data.repository.CrudRepository;

import com.nimbus.demo.model.Item;

public interface ItemRepo extends CrudRepository<Item, Integer> {

}
