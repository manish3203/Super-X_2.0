
/*

   Program 2 : WAP to print the following pattern
	       Take input from the user

	       1
	       7 26
	       63 124 215
	       342 511 728 999

*/

import java.util.*;

class Solution {
	
	static void printPattern(int row) {
		
		int num = 1;

		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=i; j++) {
				
				if(i == 1) {

					System.out.print(i+"   ");
				}else {
					
					System.out.print(((num*num*num)-1)+"   ");
				}
				num++;		
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
