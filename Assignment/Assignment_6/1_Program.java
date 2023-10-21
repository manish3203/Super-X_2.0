
/*

   Program 1 : WAP to print the factorial of digits in a given range.
	       Input: 1-10

*/

import java.util.*;

class Solution {
	
	static void numFact(int start,int end) {

		for(int i=start; i<=end; i++) {
			
			int fact = 1;
			for(int j=1; j<=i; j++) {

				fact = fact*j;
			}
			System.out.println(i+" = "+fact);
		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

                System.out.println("Enter starting number : ");
                int start = sc.nextInt();
                
		System.out.println("Enter ending number : ");
                int end = sc.nextInt();

                numFact(start, end);
	}
}
