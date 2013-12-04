package org.feup.esin.p3;

public class Student extends Person{
	private String major;

	Student(String name, int yearBirth, String major){
		super(name, yearBirth);
		setMajor(major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
