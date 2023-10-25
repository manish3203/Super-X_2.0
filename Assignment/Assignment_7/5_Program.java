
/*

   Program 5 : WAP to replace vowels to # in given string
	       Input:Meta Data
	       output: M#t# D#t#

*/

import java.util.*;

class Solution {
	
	static String replaceVowel(String str) {
		
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
				
				sb.append('#');
			}else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {

                                sb.append('#');
                        }else {

				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string : ");
		String str = sc.nextLine();
		
		System.out.println("given string : "+str);

		String updatedString = replaceVowel(str);
		
		System.out.println("updated string : "+updatedString);

	}
}
