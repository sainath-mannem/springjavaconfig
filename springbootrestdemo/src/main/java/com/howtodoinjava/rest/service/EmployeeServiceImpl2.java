package com.howtodoinjava.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.rest.dao.EmployeeDAO;
import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

@Service("employeeService2")
public class EmployeeServiceImpl2 implements EmployeeService  {

	 @Autowired
	 private EmployeeDAO employeeDao;

	public Employees getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	@Override
	public Employees getAllEmployees(int iden) {
		// TODO Auto-generated method stub
		return null;
	}

}
