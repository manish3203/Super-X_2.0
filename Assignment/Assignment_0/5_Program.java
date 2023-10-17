
/*
	5] Input : 45689
	   Output : 17,14,11,9,4

*/

class Solution {

	public static void main(String[] args) {

		int num = 45689;
		int temp = num;
		int count = 0;
		while(temp != 0) {

			count++;
			temp = temp/10;
		}

		int arr[] = new int[count];
		int itr = 0;
		int temp1 = num;

		while(temp1 != 0) {
			
			int rem = temp1 % 10;

			arr[itr] = rem;
			itr++;

			temp1 = temp1/10;
		}
		for(int i=0; i<arr.length-1; i++) {
			int sum = 0;

			for(int j=i+1; j<=i+1; j++) {

				sum = arr[i] + arr[j];
			}
			System.out.println(sum);
		}
		System.out.println(arr[arr.length-1]);
	}
}


