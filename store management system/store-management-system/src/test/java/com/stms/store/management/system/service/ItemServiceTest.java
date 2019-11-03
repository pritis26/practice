package com.stms.store.management.system.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.stms.store.management.system.model.Item;
import com.stms.store.management.system.repository.ItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemServiceTest {
	@Autowired
	ItemService itemService;

	@MockBean
	ItemRepository itemRepository;

	Item item1 = new Item(1, "mobile", "electronics", "2019/11/02", "active");
	Item item2 = new Item(2, "laptop", "electronics", "2019/11/02", "active");

	@Test
	void createItemTest() {
		Mockito.when(itemRepository.save(item1)).thenReturn(item1);
		assertThat(itemService.createItem(item1)).isEqualTo(item1);
	}

	@Test
	void showItemTest() {
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);

		Mockito.when(itemRepository.findAll()).thenReturn(itemList);
		assertThat((itemService.showItem())).isEqualTo(itemList);

	}

	@Test
	void editItemTest() {
		Mockito.when(itemRepository.findById(1)).thenReturn(Optional.of(item1));
		item1.setItemName("camera");
		Mockito.when(itemRepository.save(item1)).thenReturn(item1);
		assertThat(itemService.editItem(item1, 1)).isEqualTo(item1);
	}

	@Test
	void removeItemTest() {
		Mockito.when(itemRepository.getOne(1)).thenReturn(item1);

		Mockito.when(itemRepository.existsById(item1.getItemId())).thenReturn(false);

		assertFalse(itemRepository.existsById(item1.getItemId()));

	}

}
