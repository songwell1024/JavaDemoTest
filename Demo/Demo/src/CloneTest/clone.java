package CloneTest;

public class clone {
	
	public static void main(String[] args) {
		try {
			Employee original = new Employee("Tom", 10000 );
			original.setHireDay(2000, 07, 07);
			Employee copy = original.clone();
			copy.raiseSalary(100);
			copy.setHireDay(2001, 1, 1);
			System.out.println("original=" + original);
			System.out.println("copy=" + copy);
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
