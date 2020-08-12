package com.merlinsoftech;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumerPathVariableExample {
	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Employee> responseEntity = restTemplate.exchange("http://localhost:9000/find/{eno}", HttpMethod.GET, null,Employee.class, "1");
		Employee employee = responseEntity.getBody();
		System.out.println(employee);
	}
}
