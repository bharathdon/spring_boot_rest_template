package com.merlinsoftech;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GetWIthHeaderExample {
	public static void main(String[] args) {

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(new MediaType[] {MediaType.APPLICATION_JSON}));
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		httpHeaders.set("my_other_key", "my_other_value");
		
		
		HttpEntity<Employees> entity = new HttpEntity<Employees>(httpHeaders);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Employees> responseEntity
		= restTemplate.exchange("http://localhost:9000/find", HttpMethod.GET, entity, Employees.class);
		
		Employees employees = responseEntity.getBody();
		List<Employee> employee = employees.getEmployee();
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}
	}
}
