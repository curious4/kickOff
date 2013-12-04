package org.feup.esin.p3;

public class Instructor extends Person{
	private int salary;
	
	Instructor(String name, int yearBirth, int salary){
		super(name, yearBirth);
		setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
