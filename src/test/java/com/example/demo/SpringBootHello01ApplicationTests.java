package com.example.demo;

import com.example.demo.controller.Controller01;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHello01ApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	ApplicationContext ioc;

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(new Controller01()).build();
	}
	@Test
	public void contextLoads() {
	}


	@Test
	public void saveUser() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
				.param("name","")
				.param("age","666")
				.param("addr","test")
		);
	}

	@Test
	public void testMyAppconfig(){
		boolean helloService = ioc.containsBean("helloService");
		System.out.println(helloService);
	}



}
