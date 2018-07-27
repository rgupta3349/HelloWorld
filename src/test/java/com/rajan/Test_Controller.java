package com.rajan;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rajan.controller.Controller;

@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class Test_Controller {
	
	//private TestRestTemplate restTemplate;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getEmployeeDetails() throws Exception
	{
		mockMvc.perform(MockMvcRequestBuilders.get("/helloworld")).andExpect(status().isOk());
		//.andExpect(content().string("The String ResponseBody"));
	}
	
	

}
