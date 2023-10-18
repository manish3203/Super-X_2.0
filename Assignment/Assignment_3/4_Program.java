/*
        Program 4 : WAP to print the composite numbers in the given range
                    
                    Input : start : 1
                            end : 10


*/

import java.util.*;

class Solution {

        static void checkPrimeComposite(int start, int end) {

                System.out.println("The composite number of given range is : ");
                for(int i=start; i<=end; i++) {
			
			int count = 0;
			for(int j=1; j<=i; j++) {

				if(i % j == 0)

					count++;
			}
			if(count > 2)

				System.out.print(i+"  ");
		}
                System.out.println();
        }
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a starting number : ");
                int start = sc.nextInt();

                System.out.println("Enter a ending number : ");
                int end = sc.nextInt();

                checkPrimeComposite(start, end);
        }
}

