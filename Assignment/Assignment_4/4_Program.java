
/*
	
   Program 4 : WAP to print each reverse numbers in the given range
	       Input: start:25435
	       end: 25449

*/

import java.util.*;

class Solution {

	static void convertReverse(int start, int end){

		for(int i=start;i<=end;i++){

			int temp1 = 0 ;
			int temp2 = i;

			while(temp2 != 0){

				int rem = temp2 % 10;
				temp1 = temp1*10 + rem;
				temp2 = temp2/10;
			}
			System.out.println("Original Number : "+i+" :: Reverse Number : "+temp1);
		}
	}
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter starting number");
		int start = sc.nextInt();
	
		System.out.println("Enter ending number");
		int end = sc.nextInt();

		convertReverse(start,end);

	}
}
