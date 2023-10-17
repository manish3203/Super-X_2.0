
/*
	9] input : d f T b n S r O v r y t
	   output : D F T b N s R o V r Y t

*/

class Solution {
	
	String evenOddIndex(String str) {
		
		char arr[] = str.toCharArray();

		for(int i = 0; i < str.length(); i++) {
			
			if(i % 2 == 0) {
				
				if(arr[i] >= 'a') {
				
					arr[i] = (char)(arr[i] - 32);
				} 
			} else {
				
				if(arr[i] <= 'Z') {		
					arr[i] = (char)(arr[i] + 32);
				}
			}
		}
		return new String(arr);
	}	
	public static void main(String[] args) {
		
		Solution obj = new Solution();

		String evenOdd = obj.evenOddIndex("dfTbnSrOvryt");

		System.out.println(evenOdd);
	}
}
