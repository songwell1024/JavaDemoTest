package TestTest;
import java.util.Scanner.*;

public class Test2 {
	public static void main(String[] args) {
		int[][] matrix  = {{1, 3, 5, 7},{10, 11, 16, 20},{23, 30, 34, 50}};
		boolean tf = searchMatrix(matrix, 3);
		System.out.println(tf);
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
		int r = matrix.length;
		int l = matrix[0].length;
		boolean  b = false;
		while( (r + l)/2 != 0) {
			if(target >matrix[r/2][l/2]) {
				r = r/2;
				int[][] num = new int[r][l];
				for(int i =0 ; i < num.length;i++) {
					for(int j =0; j< num[0].length;j++) {
						num[i][j] = matrix[r+i][j];
					}
				}
				matrix = num;
				
			}
			else if(target < matrix[r/2][l/2]) {
				r = r/2;
				int[][] num = new int[r][l];
				for(int i =0 ; i < num.length;i++) {
					for(int j =0; j< num[0].length;j++) {
						num[i][j] = matrix[i][j];
					}
				}
				matrix = num;
			}
			else {
				if(target == matrix[r/2][l/2]) {
				    b = true;
				}
			}
			
		}
		if(b == true) {
			return true;
		}
		else{
			return false;
		}
	}
}
