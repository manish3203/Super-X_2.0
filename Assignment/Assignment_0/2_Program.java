
/*
	2] Armstrong number

*/

class Solution {

	public static void main(String[] args) {

		int num = 153;

		int temp1 = num;
		int count = 0;
		while(temp1 != 0) {
			
			count++;
			temp1 = temp1/10;
		}

		int temp2 = num;
		int sum = 0;
		while(temp2 != 0) {
			
			int rem = temp2 % 10;
			int mul = 1;

			for(int i=1; i<=count; i++) {

				mul = mul*rem;
			}
			sum = sum + mul;

			temp2 = temp2/10;
		}

		if(num == sum) {

			System.out.println("It is armstrong number ");
		}else {

			System.out.println("It is not armstrong number ");
		}
	}
}

			
