package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable> {
	@Query(value = "SELECT * FROM employee e WHERE e.city = ?1", nativeQuery = true)
	List<Employee> findByCity(String city);

}
