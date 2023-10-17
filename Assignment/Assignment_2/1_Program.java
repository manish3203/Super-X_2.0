
/*
	Program 1 : WAP to print the following pattern

		    Take input from user

		    1  2  3  4
		    2  3  4  5
		    3  4  5  6
		    4  5  6  7

*/

import java.util.*;

class Solution {
	
	static void printPattern(int row, int col) {

		for(int i=1; i<=row; i++) {
			
			int num = i;
			for(int j=1; j<=col; j++) {

				System.out.print(num+"  ");
				num++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		int row = sc.nextInt();
		
		System.out.println("Enter number of column : ");
		int col = sc.nextInt();

		printPattern(row, col);
	}
}
