
/*
	10] check string pallindrome

*/

class Solution {

	public static void main(String[] args) {

		String str1 = "malylam";

		StringBuilder sb = new StringBuilder(str1);

		sb.reverse();

		String str2 = sb.toString();
		
		//compare
		if(str1.equals(str2)) {

			System.out.println("Given string is pallindrome " );
		}else {

			System.out.println("Given string is not pallindrome ");
		}
	}
}
