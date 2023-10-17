
/*
	Program 5 : WAP to count the size of given string
		    (without using inbuilt method)

*/

import java.util.*;

class Solution {
	
	static int checkStringCount(String str) {
		
		int count = 0;

		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) != '\n')

				count++;
		}
		return count;

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string : ");
		String str = sc.nextLine();

		int stringCount = checkStringCount(str);

		System.out.println("String count : "+stringCount);
	}
}
