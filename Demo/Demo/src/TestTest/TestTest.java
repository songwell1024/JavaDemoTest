package TestTest;

import java.util.Scanner;
//��Сдת��

public class TestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  = new Scanner(System.in);
		String  s = in.nextLine();
		char c = s.charAt(0);
		c = lowerCaseToUpperCase(c);
		System.out.println(c);

	}
	
	public static char lowerCaseToUpperCase(char character)  {
		int number1 = (int) character;
		if(number1 >= 97 && number1 <= 122) {
			int number2 = number1 - 32;
			character = (char) number2;
		}
		if(number1 >=65 && number1 <= 90) {
			int number2 = number1 +32;
			character = (char) number2;
		}
		return character;
	}
}

