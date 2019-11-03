package com.stms.store.management.system.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stms.store.management.system.model.Item;
import com.stms.store.management.system.service.ItemService;

@RunWith(SpringRunner.class) // SpringRunner is the new name for SpringJUnit4ClassRunner. It enables full
								// support of spring context loading and dependency injection of the beans in
								// the tests.
@WebMvcTest(ItemController.class)
public class ItemControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ItemService itemService;

	Item item1 = new Item(1, "mobile", "electronics", "2019/11/02", "active");
	Item item2 = new Item(2, "laptop", "electronics", "2019/11/02", "active");

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}

	@Test
	void testAddEmployee() throws Exception {

		String inputInJson = this.mapToJson(item1);

		String URI = "/STMS/createItem";

		Mockito.when(itemService.createItem((Mockito.any(Item.class)))).thenReturn(item1);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(URI).accept(MediaType.APPLICATION_JSON)
				.content(inputInJson).contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		String outputInJson = response.getContentAsString();

		assertThat(outputInJson).isEqualTo(inputInJson);

		assertEquals(HttpStatus.OK.value(), response.getStatus());

	}

	@Test
	void testGetAllEmployeeInfo() throws Exception {

		List<Item> itemList = new ArrayList<>();
		itemList.add(item1);
		itemList.add(item2);

		Mockito.when(itemService.showItem()).thenReturn(itemList);

		String URI = "/STMS/showItem";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		String expectedJson = this.mapToJson(itemList);

		String outputInJson = result.getResponse().getContentAsString();

		assertThat(outputInJson).isEqualTo(expectedJson);

	}
	@Test
	public void testdeleteEmployee() throws Exception {

		Mockito.when(itemService.removeItem((Mockito.anyInt()))).thenReturn("DELETED");

		MvcResult result = this.mockMvc.perform(delete("/STMS/removeItem/{itemId}", new Integer(1))).andReturn();

		MockHttpServletResponse response = result.getResponse();

		String outputStr = response.getContentAsString();

		assertThat(outputStr).isEqualTo("DELETED");
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}
}
