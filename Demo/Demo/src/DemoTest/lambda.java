package DemoTest;

import java.lang.reflect.Array;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class lambda {
	public static void main(String[] args) {
		String[] planets = new String[]{"da", "ba", "tua", "dong", "ta"};
		
		System.out.println(Arrays.toString(planets));
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		Arrays.sort(planets,(first, second) -> first.length()-second.length());
		System.out.println(Arrays.toString(planets));
		
		Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
		t.start();
		
		JOptionPane.showMessageDialog(null, "quit program");
		System.exit(0);
		
	}

}
/*
class Greeter{
	public void greet() {
		System.out.println("shgqwiu");
	}
}

class TimerGreeter extends Greeter{
	public void greet() {
		Timer t = new Timer(1000, super::greet);
		t.start();
	}
} */
