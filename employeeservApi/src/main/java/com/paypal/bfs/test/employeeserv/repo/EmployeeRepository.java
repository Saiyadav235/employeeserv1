package com.paypal.bfs.test.employeeserv.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paypal.bfs.test.employeeserv.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
