package org.feup.esin.p3;

public class Person {
	private String name;
	private int yearBirth;
	
	Person(){
		setName("NO_NAME");
		setYearBirth(1850);
	}
	
	Person(String name, int yearBirth)
	{
		setName(name);
		setYearBirth(yearBirth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
}
