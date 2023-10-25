
/*

   Program 1 : WAP to print the following pattern
	       Take input from the user

	       A B C D
	       1 3 5 7
	       A B C D
	       9 11 13 15
	       A B C D

*/

import java.util.*;

class Solution {
	
	static void printPattern(int row, int col) {
		
		int num = 1;

		for(int i=1; i<=row; i++) {
			
			int ch = 65;
			for(int j=1; j<=col; j++) {

				if(i%2 == 1) {
					
					System.out.print((char)(ch)+"   ");
					ch++;
				}else {
					
					System.out.print(num+"   ");
					num+=2;
				}		
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		int row = sc.nextInt();

		System.out.println("Enter number of col : ");
		int col = sc.nextInt();

		printPattern(row, col);
	}
}
