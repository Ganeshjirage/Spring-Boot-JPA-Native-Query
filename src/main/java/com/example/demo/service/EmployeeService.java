package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	public List<Employee> getListByCity(String city);

	public Employee saveEmployee(Employee employee);
}
