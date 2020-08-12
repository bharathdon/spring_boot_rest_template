package com.merlinsoftech;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumerRequestParamExample {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Employee> responseEntity = restTemplate.getForEntity("http://localhost:9000/find1?eno=155", Employee.class, "1");
		Employee employee = responseEntity.getBody();
		System.out.println(employee);
	}
}
