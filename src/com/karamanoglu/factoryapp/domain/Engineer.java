package com.karamanoglu.factoryapp.domain;

public class Engineer extends Employee{
	
	protected String field;
	public static final int ENGİNEERİNG_PAYMENT = 8_000;
	
	public Engineer(int no, String name, double salary, int year,String field) {
		super(no, name, salary, year);
		this.field = field;
		}
	

	public void work() {
		System.out.println("Engineer "+ name + " is engineering.");
	}
	
	@Override
	public double calculateSalary() {
		salary = ENGİNEERİNG_PAYMENT + super.calculateSalary();
		return salary;
	}
	



	
	

}
