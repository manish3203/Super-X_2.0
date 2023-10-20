
/*

   Program 1 : WAP to print the following pattern
               Take input from user

               A  B  C  D
               #  #  #  #
               A  B  C  D
               #  #  #  # 
*/

import java.util.*;

class Solution {
	
	static void printPattern(int row) {

		int ch = 65;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=row; j++) {

				if(i%2 == 1) {

					System.out.print((char)(ch)+"  ");
					ch++;
				}else {

					System.out.print("#  ");
					ch--;
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
