
/*
	
   Program 1 : WAP to print the following pattern
   	 	
   	       Take input from user

	       A  B  C  D
	       B  C  D  E
	       C  D  E  F
	       D  E  F  G

*/

import java.util.*;

class Solution {
	
	static void printPattern(int row) {

		for(int i=1; i<=row; i++) {
			
			int ch = 64+i;
			for(int j=1; j<=row; j++) {

				System.out.print((char)(ch)+"  ");
				ch++;
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
