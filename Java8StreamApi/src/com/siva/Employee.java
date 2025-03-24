package com.siva;

public class Employee {

	String EmployeeName;
	Integer EmployeeId;
	String EmployeeAddress;
	Integer EmployeeSalary;

	public Employee(String employeeName, Integer employeeId, String employeeAddress, Integer employeeSalary) {

		EmployeeName = employeeName;
		EmployeeId = employeeId;
		EmployeeAddress = employeeAddress;
		EmployeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	public Integer getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(Integer employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId + ", EmployeeAddress="
				+ EmployeeAddress + ", EmployeeSalary=" + EmployeeSalary + "]";
	}

}
