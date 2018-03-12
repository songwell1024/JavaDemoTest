package InterfacesTest;

public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise  = salary * byPercent /100;
		salary += raise;
	}
	
	public int compareTo(Employee other) {                      //用这个对象于other进行比较 
		return Double.compare(salary, other.salary);                 //这个函数在调用sort的时候会有用，所以必须要定义
	}
}
