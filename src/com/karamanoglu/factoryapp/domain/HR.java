package com.karamanoglu.factoryapp.domain;

public class HR {
	public void paySalary(Worker w) {
		double salary = w.calculateSalary();
		System.out.println("Paying " + w.getName() + " salary: " + salary);
	}
}
