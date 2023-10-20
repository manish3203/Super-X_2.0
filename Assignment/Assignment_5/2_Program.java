
/*

   Program 2 : WAP to print the following pattern
	       Take row input from the user

	       A
	       B A
	       C B A
	       D C B A
*/

import java.util.*;

class Solution {
	
	static void printPattern(int row) {

		for(int i=1; i<=row; i++) {
			
			int ch = 65+i;
			for(int j=1; j<=i; j++) {

				System.out.print((char)(--ch)+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		int row = sc.nextInt();

		printPattern(row);

	}
}
