
/*

   Program 3 : WAP to check whether the given number is perfect or not.

*/

import java.util.*;

class Solution {
	
	static boolean checkPerfectNum(int num) {

		int sumCheck = 0;

		for(int i=1; i<=num; i++) {
			
			if(i != num) {
				
				if(num % i == 0) {

					sumCheck = sumCheck + i;
				}
			}
		}
		if(num == sumCheck) {

			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		boolean checkNum = checkPerfectNum(num);

		if(checkNum) {

			System.out.println(num+" is perfect number. ");
		}else {
			
			System.out.println(num+" is not perfect number. ");
		}
	}
}
