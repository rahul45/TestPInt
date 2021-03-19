package com.test;

public class Employee implements Comparable<Employee> {
	private String name;
	private int empID;
	private double salary;
	private String designation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.empID-o.getEmpID();
	}

}
