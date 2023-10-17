
/*
	2]

	0
	3  8
	15 24  35  
	48 63  80  99

*/

import java.util.*;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		int row = sc.nextInt();
		
		int num = 0;
		int itr = 1;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=i; j++) {

				System.out.print(num+" ");
				itr+=2;
				num+=itr;
			}
			System.out.println();
		}
	}
}
