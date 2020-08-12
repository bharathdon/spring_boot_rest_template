package com.merlinsoftech;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SimpleGetRequest {
	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Employees> responseEntity = restTemplate.getForEntity("http://localhost:9000/find",
				Employees.class);
		responseEntity.getStatusCode();
		Employees employees = responseEntity.getBody();
		List<Employee> employee = employees.getEmployee();
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}

	}
}
