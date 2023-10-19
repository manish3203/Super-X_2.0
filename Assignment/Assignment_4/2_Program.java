
/*

   Program 2 : WAP to print the following pattern

   		Take row input from user
		
		1
		2 1
		3 2 1
		4 3 2 1

*/

import java.util.*;

class Solution {

        static void printPattern(int row) {

                for(int i=1; i<=row; i++) {
			
			int num = i;
                        for(int j=1; j<=i; j++) {
				
				System.out.print(num+"  ");
				num--;
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

