package abstractClasses;

import java.time.*;

public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		people[0] = new Employee("Tom", 20000, 2000, 01, 01);
		people[1] = new Student("Tim","Computer");
				
		for(Person p:people) {
			System.out.println(p.getName() + ", " + p.getDescription());
		}
	}

}

abstract class Person{
	public abstract String getDescription();
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Employee extends Person {
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double s, int year, int month, int day) {
		super(name);     //���ø���Ĳ���
		s = salary;
		hireDay = LocalDate.of(year,month,day);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public String getDescription() {
		return String.format("an employee with a salary of %.2f", salary);	 //ǿ������ת��
	}
	
	public void raiseSalary() {
		double baseSalary = salary * 10 / 100;
		salary += baseSalary;
	}
}

class Student extends Person{
	private String major;
	
	public Student(String name,String major) {
		super(name);
		this.major = major;
	}
	
	public String getDescription() {
		return "a student majoring in " + major;
	}
}