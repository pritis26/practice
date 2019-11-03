package com.stms.store.management.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stms.store.management.system.model.Item;
import com.stms.store.management.system.service.ItemService;

@RestController
@RequestMapping("/STMS")
public class ItemController {
	@Autowired
	ItemService itemService;

	@GetMapping("/showItem")
	public List<Item> showItem() {
		return itemService.showItem();
	}

	@PostMapping("/createItem")
	public Item createItem(@RequestBody Item item) {

		return itemService.createItem(item);
	}

	@DeleteMapping("/removeItem/{itemId}")
	public String removeItem(@PathVariable Integer itemId) {
		itemService.removeItem(itemId);
		return "DELETED";
	}

	@PutMapping("/editItem/{itemId}")
	public Item editItem(@RequestBody Item item, @PathVariable Integer itemId) {
		return itemService.editItem(item, itemId);
	}

}
