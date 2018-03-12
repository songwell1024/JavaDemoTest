package DemoTest;

import java.time.*;

/**
 * @This program test the Employee class
 * @author Wilson song
 * @version 1.0 2018-03-02
 */

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom",10000,2000,1,1);
		staff[1] = new Employee("Timi",15000,2001,1,1);
		staff[2] = new Employee("Tame",20000,2002,1,1);
		
		for(Employee e : staff) {
			e.raiseSalary(20);
		}
		
		for(Employee e : staff) {
			System.out.println("name:" + e.getName()+",salary:" +
		e.getSalary() + ",hireDay:"+e.getHireDay());
		}	
	}
}

class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}
}