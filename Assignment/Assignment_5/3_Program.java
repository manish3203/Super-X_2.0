
/*

   Program 3 : WAP to find the factorial of a given number.
 
*/

import java.util.*;

class Solution {
	
	static int fact = 1;

	static int numFact(int num) {

		if(num > 0) {

			fact = fact * num;
			num--;
			numFact(num);
		}
		return fact;

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		int factorial = numFact(number);

		System.out.println("Factorial : "+factorial);
	}
}
