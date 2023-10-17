
/*
	1]

	1  2  3  4
	4  5  6  7
	6  7  8  9
	7  8  9  10

*/

import java.util.*;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		int row = sc.nextInt();

		System.out.println("Enter number of col : ");
		int col = sc.nextInt();

		int num = 1;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=row; j++) {

				System.out.print(num+" ");
				num++;
			}
			num = num-i;
			System.out.println();
		}
	}
}
