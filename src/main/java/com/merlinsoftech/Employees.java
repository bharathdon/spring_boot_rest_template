package com.merlinsoftech;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Employees {

	private List<Employee> employee;
}
