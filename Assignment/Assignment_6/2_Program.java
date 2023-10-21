
/*
 
   Program 2 : WAP to print the following pattern
	       Take row input from the user

	       a
	       A B
	       a b c
	       A B C D

*/

import java.util.*;

class Solution {

        static void printPattern(int row) {

                for(int i=1; i<=row; i++) {

                        int ch = 65;
                        for(int j=1; j<=i; j++) {
				
				if(i%2 == 0) {
                                	
					System.out.print((char)(ch)+"  ");
					ch++;
				}else {

					System.out.print((char)(ch+32)+"  ");
					ch++;
				}

                        }
                        System.out.println();
                }
        }
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of row : ");
                int row = sc.nextInt();

                printPattern(row);

        }
}

