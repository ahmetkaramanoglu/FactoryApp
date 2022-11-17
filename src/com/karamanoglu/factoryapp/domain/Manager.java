package com.karamanoglu.factoryapp.domain;

public class Manager extends Employee {
	
	protected String department;
	public static final int MANAGEMENT_PAYMENT = 10_000;
	
	public Manager(int no, String name, double salary,int year,String department) {
		super(no,name,salary,year);
		this.department = department;
	}
	
	@Override
	public double calculateSalary() {
		salary = MANAGEMENT_PAYMENT + super.calculateSalary();
		return salary;
	}
	@Override
	public void work() {
		System.out.println("Manager " + name + " is working.");
	}
	public void manage() {
		System.out.println("Manager " + name + " is managing.");
	}
	@Override
	public void printInfo() {
		System.out.println("*^* Manager Info *^*");
		System.out.println("Name: "+name);
		calculateSalary();
		System.out.println("Salary: "+salary);
		System.out.println("Year: "+year);
		System.out.println("Department: "+department);
	}
}
