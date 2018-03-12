package equals;

public class EqualsTest {
	public static void main(String[] args) {
		Employee alice1 = new Employee("Alice1", 20000, 2000, 1, 1);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice2", 50000, 2001, 1, 1);
		Employee bob = new Employee("Bob", 70000, 2001, 1, 2);
		
		System.out.println("alice1 == alice2:" + (alice1 == alice2));
		System.out.println("alice1 == alice3:" + (alice1 == alice3));
		System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
		System.out.println("alice1.equals(bob):" + alice1.equals(bob));
		System.out.println("bob.toString():" + bob);
		
		Manager cral = new Manager("Cral", 80000, 2100, 1, 1);
		Manager boss = new Manager("Cral", 80000, 2100, 1, 1);
		
		boss.setBonus(10000);
		
		System.out.println("boss.toString():" + boss);
		System.out.println("cral.equals(boss)£º" + cral.equals(boss));
		System.out.println("alice1.hashCode():" + alice1.hashCode());
		System.out.println("alice3.hashCode():" + alice3.hashCode());
		System.out.println("bob.hashCode():" + bob.hashCode());
		System.out.println("cral.hashCode():" + cral.hashCode());
	}
}
