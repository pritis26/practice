package com.stms.store.management.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.stms.store.management.system.model.Item;
import com.stms.store.management.system.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepo;

	public List<Item> showItem() {
		return itemRepo.findAll();
	}

	public Item createItem(Item item) {
		return itemRepo.save(item);
	}

	public String removeItem(Integer itemId) {
		itemRepo.deleteById(itemId);
		return "DELETED";
	}

	public Item editItem(Item item, Integer itemId) {
		List<Item> itemList = itemRepo.findAll();
		for (Item it : itemList) {
			if (it.getItemId() == itemId) {
				it.setItemId(itemId);
				itemRepo.save(item);

			}
		}
		return item;

	}
}
