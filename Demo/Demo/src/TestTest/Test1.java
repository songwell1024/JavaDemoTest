package TestTest;
import java.util.*;
import java.util.Scanner;
//�������׼��

public class Test1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s =  hexConversion( n,  k);
		System.out.println(s);
		
		
	}
	
		
	public static String hexConversion(int n, int k) {
	        // write your code here
	    String str4 = Integer.toString(n,k) ;  ///10����ת����7���Ƶ��ַ���
	    str4 = str4.toUpperCase();
	     return str4;   
	    }
		
}
