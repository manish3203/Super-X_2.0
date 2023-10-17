
/*
	Program 4 : WAP to print the odd numbers in the given range
	            
		    Input : start : 1
		    	    end : 10


*/

import java.util.*;

class Solution {

        static void checkOddNumber(int start, int end) {
		
		System.out.println("The odd number of given range is : ");
                for(int i=start; i<=end; i++) {

			if(i % 2 == 1) 

				System.out.print(i+" ");
		}
		System.out.println();
        }
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a starting number : ");
                int start = sc.nextInt();
                
		System.out.println("Enter a ending number : ");
                int end = sc.nextInt();

		checkOddNumber(start, end);
        }
}

