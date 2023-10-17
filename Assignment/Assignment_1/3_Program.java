
/*
	3]

	5
	6  8
	7  10  13
	8  12  16  20
	9  14  19  24  29
*/

import java.util.*;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row : ");
		int row = sc.nextInt();

		int num = row;
		for(int i=1; i<=row; i++) {
			int min = 0;
			for(int j=1; j<=i; j++) {

				System.out.print(num+" ");
				num+=i;
				min+=i;
			}
			if(i > 1) {

				num = num - (--min);
			}	
			System.out.println();
		}
	}
}
