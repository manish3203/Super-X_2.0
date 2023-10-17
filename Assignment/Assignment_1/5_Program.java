
/*
	5] write a program to print prime numbers in a 
	   given range from user

*/

import java.util.*;
class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter ending number : ");
		int end = sc.nextInt();

		for(int i=start; i<=end; i++) {
			int count = 0;

			for(int j=1; j<=i; j++) {

				if(i%j == 0) {

					count++;
				}
			}
			if(count == 2) {

				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
