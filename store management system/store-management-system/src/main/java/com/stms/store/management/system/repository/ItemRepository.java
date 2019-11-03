package com.stms.store.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stms.store.management.system.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
