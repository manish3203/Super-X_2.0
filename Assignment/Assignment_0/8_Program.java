
/*
	8] input : a d g t i o s e o b i
	   output
	   a = 1;
	   e = 1;
	   i = 2;
	   o = 2;
*/

class Solution {

	public static void main(String[] args) {

		char carr[] = new char[] {'a','d','g','t','i','o','e','o','b','i'};

		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;

		for(int i=0; i<carr.length; i++) {

			if(carr[i] == 'a') {

				countA++;
			}else if(carr[i] == 'e') {

				countE++;
			}else if(carr[i] == 'i') {

				countI++;
			}else if(carr[i] == 'o') {

				countO++;
			}else if(carr[i] == 'u') {

				countU++;
			}
		}
		
		if(countA > 0) {
		
			System.out.println("a = "+countA);
		}
		if(countE > 0) {
			
			System.out.println("e = "+countE);
		}
		if(countI > 0) {
		
			System.out.println("i = "+countI);
		}
		if(countO > 0) {
			
			System.out.println("o = "+countO);
		}
		if(countU > 0) {
		
			System.out.println("u = "+countU);
		}
	}
}
