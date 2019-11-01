package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Employee;

public interface EmployeeDao {
	
	public void startForm(int employeeId) throws SQLException;
	public List<Employee> getAllEmployees() throws SQLException;
	public Employee getEmployee(int employeeId) throws SQLException;
	public Employee employeeLogin(String username, String password) throws SQLException;
	public List<Employee> getSubordinates(int employeeId) throws SQLException;

}
