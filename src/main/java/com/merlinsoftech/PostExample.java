package com.merlinsoftech;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PostExample {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

		Employee employee = new Employee(1, "bharath", 100d);

		HttpEntity<Employee> httpEntity = new HttpEntity<Employee>(employee);

		ResponseEntity<Employee> responseEntity = restTemplate.postForEntity("http://localhost:9000/insert", httpEntity,
				null, Employee.class);
		responseEntity.getStatusCode();
		if (responseEntity.getStatusCode() == HttpStatus.ACCEPTED) {
			Employee body = responseEntity.getBody();
			Employee employee2 = responseEntity.getBody();
			System.out.println("employee created");
		}

	}

}
