package InterfacesTest;

import java.util.*;

public class EmployeeSortTest {
	public static void main(String[] args) {
		Employee[] staff =  new Employee[3];
		
		staff[0] = new Employee("Tom", 20000);
		staff[1] = new Employee("Tim", 70000);
		staff[2] = new Employee("Tam", 50000);
		
		Arrays.sort(staff);
		
		for(Employee e : staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
		
	}

}