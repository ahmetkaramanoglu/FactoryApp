package com.karamanoglu.factoryapp.domain;

public class Director extends Manager {
	
	protected int bonus;
	public Director(int no, String name, double salary,int year,String department,int bonus){
		super(no,name,salary,year,department);
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		salary = bonus+20_000 + super.calculateSalary();
		return salary;
	}
	@Override
	public void work() {
		System.out.println("Director " + name + " is working.");
	}
	public void director() {
		System.out.println("Director " + name + " is director.");
	}
	@Override
	public void printInfo() {
		System.out.println("*^* Director Info *^*");
		System.out.println("Name: "+name);
		calculateSalary();
		System.out.println("Salary: "+salary);
		System.out.println("Year: "+year);
		System.out.println("Department: "+department);
	}
	

}
