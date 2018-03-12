package DemoTest;

import java.util.*;
import java.io.*;

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input your name:");
		String name = in.nextLine();
		
		System.out.println("Input your age:");
		int age = in.nextInt();
		
		System.out.println("Input a number:");
		double num = in.nextDouble();
		
		Console cons = System.console();
	    //char[] password = cons.readPassword("password:");
		
		System.out.println("Hello," + name +"," + "next year yow will be " + age);
		System.out.printf("The number you input is %.2f\n" ,num);
		System.out.printf("Today is %tc",new Date());
		//System.out.println("Your password is ," + password[0]);
	}
}