
/*
 
   Program 4 : WAP to print strong numbers in a given range.
	       Input: 1 to 10

*/

import java.util.*;

class Solution {
	
	static void checkStrongNumber(int start, int end) {
		
		System.out.println("Strong number given range is : ");
		for(int i=start; i<=end; i++) {
			
			int temp = i;	
			int sum = 0;
			while(temp > 0) {	
		
				int rem = temp % 10;
				int fact = 1;

				for(int j=1; j<=rem; j++) {

					fact = fact*j;
				}
				sum = sum + fact;

				temp = temp/10;
			}
			if(i == sum) {

				System.out.print(i+"   ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a starting number : ");
		int start = sc.nextInt();
		
		System.out.println("Enter a ending number : ");
		int end = sc.nextInt();

		checkStrongNumber(start, end);
	}
}
