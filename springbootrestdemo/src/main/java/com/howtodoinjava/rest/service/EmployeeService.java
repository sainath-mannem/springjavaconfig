package com.howtodoinjava.rest.service;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

public interface EmployeeService {

	Employees getAllEmployees();

	void addEmployee(Employee employee);

	Employees getAllEmployees(int iden);
}
