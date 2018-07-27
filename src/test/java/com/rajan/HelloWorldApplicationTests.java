package com.rajan;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.rajan.entity.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class HelloWorldApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test_HelloWorld() {
		
		ResponseEntity<String> response=
		restTemplate.getForEntity("/helloworld", String.class);
		
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody().toString()).isEqualTo("Hello Rajan!!");
		
		
	}
	
	@Test
	public void test_GetEmployeeDetails() {
		
		ResponseEntity<Employee> response=
		restTemplate.getForEntity("/employee", Employee.class);
		
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		
		assertThat(response.getBody().getName()).isEqualTo("Rajan");
		assertThat(response.getBody().getType()).isEqualTo("FullTime");
		
		
	}
	
	@Test
	public void test_ValidateController()
	{
		
	}

}
