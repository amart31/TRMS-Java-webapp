package com.revature.model;

public class Employee {
	private int employeeID;
	private String username;
	private String password;
	
	private String firstName;
	private String lastName;
	private String phoneNum;
	
	private double availableFunds;
	
	private int directSupervisorID;
	private int departmentHeadID;
	private int benefitsCordinatorID;
	
	private boolean isSupervisor;
	private boolean isDepartmentHead;
	private boolean isBenefitsCordinator;
	
	public Employee() {
		
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public double getAvailableFunds() {
		return availableFunds;
	}

	public void setAvailableFunds(double availableFunds) {
		this.availableFunds = availableFunds;
	}

	public int getDirectSupervisorID() {
		return directSupervisorID;
	}

	public void setDirectSupervisorID(int directSupervisorID) {
		this.directSupervisorID = directSupervisorID;
	}

	public int getDepartmentHeadID() {
		return departmentHeadID;
	}

	public void setDepartmentHeadID(int departmentHeadID) {
		this.departmentHeadID = departmentHeadID;
	}

	public int getBenefitsCordinatorID() {
		return benefitsCordinatorID;
	}

	public void setBenefitsCordinatorID(int benefitsCordinatorID) {
		this.benefitsCordinatorID = benefitsCordinatorID;
	}

	public boolean isSupervisor() {
		return isSupervisor;
	}

	public void setSupervisor(boolean isSupervisor) {
		this.isSupervisor = isSupervisor;
	}

	public boolean isDepartmentHead() {
		return isDepartmentHead;
	}

	public void setDepartmentHead(boolean isDepartmentHead) {
		this.isDepartmentHead = isDepartmentHead;
	}

	public boolean isBenefitsCordinator() {
		return isBenefitsCordinator;
	}

	public void setBenefitsCordinator(boolean isBenefitsCordinator) {
		this.isBenefitsCordinator = isBenefitsCordinator;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", username=" + username + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNum=" + phoneNum + ", availableFunds="
				+ availableFunds + ", directSupervisorID=" + directSupervisorID + ", departmentHeadID="
				+ departmentHeadID + ", benefitsCordinatorID=" + benefitsCordinatorID + ", isSupervisor=" + isSupervisor
				+ ", isDepartmentHead=" + isDepartmentHead + ", isBenefitsCordinator=" + isBenefitsCordinator + "]";
	}
	
	

}
