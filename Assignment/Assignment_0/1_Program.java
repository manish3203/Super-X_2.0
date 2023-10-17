
/*
	1] factorial of even number in a given number

*/

class Solution {

	public static void main(String[] args) {

		int num = 256946;

		while(num != 0) {
			
			int rem = num%10;
			int mul = 1;

			if(rem % 2 == 0) {

				for(int i=1; i<=rem; i++) {

					mul = mul*i;
				}
				System.out.println(mul);
			}
			num = num/10;
		}
	}
}
