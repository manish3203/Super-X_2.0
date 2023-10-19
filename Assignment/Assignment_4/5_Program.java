
/*

   Program 5 : WAP to check whether the string contains characters other than
	       letters.

*/

import java.util.*;

class Solution {
	
	static int checkString(String str) {
		
		int Count = 0;

		for(int i=0; i<str.length(); i++) {

			if(65 <= str.charAt(i) && str.charAt(i) <= 90 || 97 <= str.charAt(i) && str.charAt(i) <= 122) 

				Count++;
		}
		return Count;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string : ");
		String str = sc.nextLine();

		int count = checkString(str);

		if(count == str.length()) 

			System.out.println("String contains only character.");

		else

			System.out.println("String contains character or other than letter.");
	}
}
