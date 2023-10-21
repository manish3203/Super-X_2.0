
/*

   Progrma 4 : WAP to print the following pattern
	       Take input from the user

	       1 3 5 7
	       2 4 6 8
	       9 11 13 15
	       10 12 14 16

*/

import java.util.*;

class Solution {

        static void printPattern(int row) {

		int odd = 1;
		int even =2;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=row; j++) {
				
				if(i%2 == 1) {

					System.out.print(odd+"  ");
					odd+=2;
				}else {

					System.out.print(even+"  ");
					even+=2;
				}
			}
			System.out.println();
		}
	}
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a number of row : ");
                int row = sc.nextInt();

       		printPattern(row);
        }
}

