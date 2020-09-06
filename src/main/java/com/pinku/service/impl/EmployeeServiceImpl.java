package com.pinku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinku.model.Employee;
import com.pinku.repository.EmployeeRepository;
import com.pinku.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee)
	{
		return employeeRepository.createEmployee(employee);
	}

	@Override
	public void updateEmployee(int id, Employee employee)
	{
		employeeRepository.updateEmployee(id, employee);
	}
	
	@Override
	public Employee getEmployee(int id)
	{
		return employeeRepository.getEmployee(id);
	}

	@Override
	public List<Employee> getEmployees()
	{
		return employeeRepository.getEmployees();
	}

	@Override
	public void deleteEmployee(int id)
	{
		employeeRepository.deleteEmployee(id);
	}

	@Override
	public boolean isEmployeeExist(int id)
	{
		return employeeRepository.isEmployeeExist(id);
	}
}
