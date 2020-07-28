package com.paypal.bfs.test.employeeserv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.model.Employee;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	EmployeeService employeeService;

	@Override
	public ResponseEntity<Employee> employeeGetById(String id) {

		/*
		 * Employee employee = new Employee();
		 * 
		 * Address address = new Address();
		 * 
		 * employee.setId(Integer.valueOf(id)); employee.setFirstName("BFS");
		 * employee.setLastName("Developer"); employee.setDateOfBirth("07/08/1992");
		 * 
		 * address.setLine1("1678, J Street"); address.setCity("Harrisberg");
		 * address.setState("PA"); address.setZipCode(89363);
		 * employee.setAddress(address);
		 */

		Employee employee = employeeService.getEmployeeById(Integer.parseInt(id));

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Employee> addEmployee(Employee request) {

		Employee employee = new Employee();
		/*
		 * employee.setId(request.getId());
		 * employee.setFirstName(request.getFirstName());
		 * employee.setLastName(request.getLastName());
		 * employee.setDateOfBirth(request.getDateOfBirth());
		 * employee.setAddress(request.getAddress());
		 */

		employeeService.saveOrUpdate(request);
		employee = employeeService.getEmployeeById(request.getId());

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
}
