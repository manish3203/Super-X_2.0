
/*

   Program 3 : WAP to check whether the given no is a palindrome number or not.

*/

import java.util.*;

class Solution {

	static int checkPallindrome(int num) {

		int temp  = 0;
		
		while(num!=0){

			int rem = num%10;
			temp = temp*10+rem;
			num = num/10;
		}
		return temp;
	}
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		int retNum = checkPallindrome(num);

		if(retNum == num) 

			System.out.println(num +" is pallindrome .");
		else

			System.out.println(num +" is not pallindrome");
		
	}
}
