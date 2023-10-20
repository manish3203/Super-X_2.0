
/*

   Program 5 : WAP to toggle the String to uppercase or lowercase
	       Input: Java output: jAVA
	       Input: data output: DATA

*/

import java.util.*;

class Solution {
	
	static String toggleString(String str) {
		
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<str.length(); i++) {

			char str1 = str.charAt(i);
			char updatedString;

			if('A' <= str1 && str1 <= 'Z') {

				updatedString = (char)(str1+32);
			}else if('a' <= str1 && str1 <= 'z') {

				updatedString = (char)(str1-32);
			}else {

				updatedString = str1;
			}

			sb.append(updatedString);
		}
		return sb.toString();
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		String update = toggleString(str);

		System.out.println("Updated : "+update);
	}
}
