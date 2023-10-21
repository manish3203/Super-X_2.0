
/*

   Program 3 : WAP to check whether the given number is a strong number or not.

*/

import java.util.*;

class Solution {

	static int checkStrongNumber(int num) {

		int temp = num;
		int strongNum = 0;

		while(temp != 0) {

			int rem = temp % 10;
			int mul = 1;
			for(int i=1; i<=rem; i++) {

				mul = mul*i;
			}
			strongNum = strongNum + mul;
			temp = temp/10;
		}
		return strongNum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int strongNum = checkStrongNumber(num);

		if(strongNum == num) 

			System.out.println(num+" is strong number. ");
		else
			
			System.out.println(num+" is not strong number. ");
	}
}
