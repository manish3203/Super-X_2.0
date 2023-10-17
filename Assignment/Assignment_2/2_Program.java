
/*
	Program 2 : WAP to print the following pattern
		    Take row input from user

		    1
		    1  2
		    2  3  4
		    4  5  6  7
*/


import java.util.*;

class Solution {

        static void printPattern(int row) {
		
		int num = 1;
                for(int i=1; i<=row; i++) {

			for(int j=1; j<=i; j++) {

				System.out.print(num+"  ");
				num++;
			}
			num--;
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

