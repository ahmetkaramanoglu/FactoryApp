package com.karamanoglu.factoryapp.domain;

public abstract class Employee implements Worker{

	protected int no;
	protected String name;
	protected double salary;
	protected int year;
	
	public Employee(int no, String name, double salary,int year) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.year = year;
	}
	
	@Override
	public double calculateSalary() {
		salary += year * 1000;
		return salary;
	}
	
	
	@Override
	public String getName() {
		return name;
	}
	
	public void printInfo() {
		System.out.println("*^* Employee Info *^*");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Year: "+year);
	}
	
	
	
}
