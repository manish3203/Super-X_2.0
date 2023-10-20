
/*

   Program 4 : WAP to print the sum of digits in a given range.
	       Input: 1 to 10
	       Input: 21 to 30

*/

import java.util.*;

class Solution {
	
	static int rangeSum(int start, int end) {
		
		int sum = 0;

		for(int i=start; i<=end; i++) {

			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter starting number : ");
		int start = sc.nextInt();

		System.out.println("Enter ending number : ");
		int end = sc.nextInt();

		int sum = rangeSum(start,end);

		System.out.println("Sum : "+sum);
	}
}
