
/*
	4]
		  
	          1
	      2   4		
	   3  6   9
	4  8  12  16

*/

import java.util.*;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of row : ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++) {
			
			int mul = 1;
			for(int j=1; j<=row; j++) {

				if(j <= row - i) {

					System.out.print("   ");
				}else {

					System.out.print(i*mul+"  ");
					mul++;
				}
			}
			System.out.println();
		}
	}
}


