package org.feup.esin.p3;

public class test {

	public static void main(String[] args) {
		Student s=new Student("Joao",1992,"MIB");
		Instructor prof= new Instructor("MM", 1970,2000);
		
		System.out.printf("Nome do Estudante: %s\nAno de Nascimento: %d\nCurso: %s\n", s.getName(), s.getYearBirth(), s.getMajor());
		System.out.printf("\nNome do Professor: %s\nAno de Nascimento: %d\nSalário: %d\n", prof.getName(), prof.getYearBirth(), prof.getSalary());
	}

}
