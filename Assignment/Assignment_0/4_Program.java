
/*
	4]
	A b C d E
	e D c B
	B c D
	d C
	C
*/

import java.util.Scanner;

class Solution {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows : ");
		int row = sc.nextInt();
		
		System.out.println("Enter columns : ");
		int col = sc.nextInt();
		
		char ch1 = 65;
		 for (int i = 1; i<=row; i++) {
          
			 for(int j=1; j<=col; j++) {

				 if(i % 2 == 1) {

					 if(j % 2 == 1) {

						 System.out.print((char)(ch1)+" ");
					 }else {

						 System.out.print((char)(ch1+32)+" ");
					 }
					 ch1++;
				 }else {
					
					 if(j%2 == 1) {

						 System.out.print((char)(ch1+32)+" ");
					 }else {

						 System.out.print((char)(ch1)+" ");
					 }
					 ch1--;			 

				 }
				
			 }
			 if(i%2 == 1) {

				 ch1--;
			 }else {
				 
				 ch1++;
			 }
			 System.out.println();
			 col--;
		 }
	}
}
