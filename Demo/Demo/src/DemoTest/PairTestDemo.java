package DemoTest;
import java.time.*;

public class PairTestDemo {
	public static void main(String[] args) {
		Manager ceo = new Manager("Tom1", 20000, 2000, 01, 01);
		Manager cfo = new Manager("Tom2", 200000, 2000, 01, 01);
		Pair1<Manager> buddies = new Pair1<>(ceo, cfo);
		printBuddies(buddies);
		
		ceo.setBonus(1000000);
		cfo.setBonus(100000);
		
		Manager[] manager = {ceo,cfo};
		
		Pair1<Employee1> result = new Pair1<>();
		minmaxBonus(manager, result);
		System.out.println("first:" + result.getFirst().getName() + ",second:" + result.getSecond().getName());	
	}
	
	public static void printBuddies(Pair1<? extends Employee1> p) {
		Employee1 first  = p.getFirst();
		Employee1 second = p.getSecond();
		System.out.println(first.getName() + "and" + second.getName() + "are buddies.");
	}
	
	public static void minmaxBonus(Manager[] a, Pair1<? super Manager> result) {
		if(a.length == 0) return;
		Manager min  = a[0];
		Manager max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(min.getBonus() > a[i].getBonus())
				min = a[i];
			if(max.getBonus() < a[i].getBonus())
				max = a[i];
		}
		result.setFirst(min);
		result.setSecond(max);
	}
	
	public static void maxminBonus(Manager[] a, Pair1<? super Manager> result) {
		minmaxBonus(a, result);
		PairAlg.swapHelper(result);
	}
}

class Pair1<T>{
	private T first;
	private T second;
	
	public Pair1() {
		first = null;
		second = null;
	}
	
	public Pair1(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void  setFirst(T newValue) {
		first =  newValue;
	}
	
	public void setSecond(T newValue) {
		second =  newValue;
	}
}

class PairAlg{
	public static boolean hasNulls(Pair<?> p) {
		return p.getFirst() == null || p.getSecond() == null;
	}
	
	public static void swap(Pair1<?> p) {
		swapHelper(p);
	}
	
	public static <T> void swapHelper(Pair1<T> p) {
		T t  = p.getFirst();
		p.setFirst(p.getSecond());
		p.setSecond(t);
	}
}

class Employee1{
	private String name;
	private double salary;
	LocalDate hireDay;
	
	
	public  Employee1(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
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

	public void RaiseSalary(double byPercent) {
		double raise  = salary * byPercent / 100;
		salary += raise;
	}

}

class Manager extends Employee1{
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day){
		super(name,salary,year,month,day);
		bonus = 0;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary = baseSalary + bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
}