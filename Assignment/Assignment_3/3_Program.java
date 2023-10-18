
/*

   Program 3 : WAP to check weather the given is prime or composite

*/

import java.util.*;

class Solution {

        static boolean checkPrimeComposite(int num) {

                int count = 0;

		for(int i=1; i<=num; i++) {

			if(num % i == 0) {

				count++;
			}
		}
		if(count == 2) {

			return true;
		}else {

			return false;
		}
        }
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a number : ");
                int num = sc.nextInt();

                boolean checkingNum = checkPrimeComposite(num);

                if(checkingNum) {

                        System.out.println(num+" is prime number.");
                }else {

                        System.out.println(num+" is composite number.");
                }
        }
}

