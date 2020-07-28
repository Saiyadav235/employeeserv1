package com.paypal.bfs.test.employeeserv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paypal.bfs.test.employeeserv.model.Employee;


@Service
public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

	public void saveOrUpdate(Employee employee);

}
