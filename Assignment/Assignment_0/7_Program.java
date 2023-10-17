
/*
	7] size : 10
	   arr1 elements : 4 2 3 6 8 7 1 0 9 5
	   output : 
	   4 2 3 6 8 7 1 0 9 5
	   1 1 0 1 1 0 0 1 0 1

*/

class Solution {
	
	static int[] checkEven(int[] arr) {

		for(int i=0; i<arr.length; i++) {

			if(arr[i] % 2 == 0) {

				arr[i] = 1;
			}else {

				arr[i] = 0;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
	
		int arr[] = new int[] {4,2,3,6,8,7,1,0,9,5};

		System.out.println("print array element : ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int updateArr[] = checkEven(arr);

		System.out.println("Updated Array : ");
		for(int i=0; i<updateArr.length; i++) {

			System.out.print(updateArr[i]+" ");
		}
		System.out.println();
	}
}
