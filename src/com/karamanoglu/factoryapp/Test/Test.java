package com.karamanoglu.factoryapp.Test;
import com.karamanoglu.factoryapp.domain.*;

public class Test {
	public static void main(String [] args) {
		//run1();
		//run2();
		run3();
	}
	
	public static void run1() {
//		Employee e1 = new Employee(1,"Ahmet",10_000,15);
//		e1.printInfo();
//		double salary = e1.calculateSalary();
//		System.out.println(salary);
//		e1.work();
		
		System.out.println("----------------------------------------");
		
		Manager m1 = new Manager(2,"Ahmet",20_000,5,"Development");
		m1.printInfo();
		double salary = m1.calculateSalary();
		System.out.println(salary);
		m1.manage();
		
		System.out.println("----------------------------------------");
		
		Director d1 = new Director(3,"Mustafa",30_000,5,"Company",10_000);
		d1.printInfo();
		salary = d1.calculateSalary();
		System.out.println(salary);
		d1.director();
	}
	
	public static void run2() {
		HR hr = new HR();
		Employee e = new Manager(1,"Ahmet",10_000,15,"H");
		hr.paySalary(e);
		
		System.out.println("----------------------------------------");
		
	    e = new Manager(2,"Mehmet",20_000,5,"Development");
		hr.paySalary(e);
		
		System.out.println("----------------------------------------");
		
	    e = new Director(3,"Mustafa",30_000,5,"Company",10_000);
		hr.paySalary(e);
		

	}
	public static void run3() {
		HR hr = new HR();
		Worker w = new Manager(1,"Ahmet",10_000,15,"H");
		hr.paySalary(w);
		
		System.out.println("----------------------------------------");
		
	    w = new Manager(2,"Mehmet",20_000,5,"Development");
		hr.paySalary(w);
		
		System.out.println("----------------------------------------");
		
	    w = new Director(3,"Mustafa",30_000,5,"Company",10_000);
		hr.paySalary(w);
		w.work();
		System.out.println("----------------------------------------");

		w = new Engineer(4,"Semih",20_000,5,"Mobile app");
		hr.paySalary(w);
		
		w.printInfo();
		

	}
}
