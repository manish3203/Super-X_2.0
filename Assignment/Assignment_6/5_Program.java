
/*
 
   Program 5 : WAP to print the occurrence of a letter in given String.
	       Input String: “Know the code till the core”
	       Alphabet : o
	       Output: 3

*/

import java.util.*;

class Solution {

        static int occuranceAlphabet(String str, char alphabet) {

		int count = 0;

		for(int i=0; i<str.length(); i++) {

			if(str.charAt(i) == alphabet) 

				count++;
		}
		return count;
	}
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a string : ");
                String str = sc.nextLine();
		
		System.out.println("Enter alphabet : ");
		char alphabet = sc.next().charAt(0);

                int count  = occuranceAlphabet(str, alphabet);

                if(count > 0) 

			System.out.println(alphabet+" : "+count);
		else

			System.out.println(alphabet+" : "+count);

        }
}

