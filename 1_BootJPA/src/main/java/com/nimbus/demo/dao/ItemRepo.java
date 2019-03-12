package com.nimbus.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.nimbus.demo.model.Item;

public interface ItemRepo extends CrudRepository<Item, Integer> {

}
