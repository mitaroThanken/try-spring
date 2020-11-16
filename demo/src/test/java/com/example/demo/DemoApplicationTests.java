package com.example.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.TEXT_HTML))
		.andExpect(status().isOk())
		.andExpect(content().string(equalTo("Hello, World!")));
	}

	@Test
	void getHelloWithName() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello?name=Test").accept(MediaType.TEXT_HTML))
		.andExpect(status().isOk())
		.andExpect(content().string(equalTo("Hello, Test!")));
	}

}
