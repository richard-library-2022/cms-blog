package com.richard.application.controller;

import java.util.List;

import com.richard.application.model.Employee;
import com.richard.application.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@PostMapping("/")
	public Employee add(@RequestBody Employee employee) {
		log.info("Employee add: {}", employee);
		return repository.add(employee);
	}

	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") Long id) {
		log.info("Employee find: id={}", id);
		return repository.findById(id);
	}

	@GetMapping("/")
	public List<Employee> findAll() {
		log.info("Employee find");
		return repository.findAll();
	}

	@GetMapping("/department/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
		log.info("Employee find: departmentId={}", departmentId);
		return repository.findByDepartment(departmentId);
	}

	@GetMapping("/organization/{organizationId}")
	public List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId) {
		log.info("Employee find: organizationId={}", organizationId);
		return repository.findByOrganization(organizationId);
	}

}
