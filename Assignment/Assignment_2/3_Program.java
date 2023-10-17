
/*
	Program 3 : WAP to check wheather the given number is odd or even

*/

import java.util.*;

class Solution {
	
	static boolean checkEvenOdd(int num) {

		if(num % 2 == 0) {

			return true;
		}else {

			return false;
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		boolean checkingNum = checkEvenOdd(num);

		if(checkingNum) {

			System.out.println(num+" is even number.");
		}else {

			System.out.println(num+" is odd number.");
		}
	}
}
