package array;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i = 0; i <arr.length; i++) {
			arr[i] = (i+1)*100;
			
			System.out.println(arr[i]);
		}
		
		
		String[] strs= new String[5]; 
		for(int i = 0; i <strs.length; i ++) {
			
			strs[i] = "abcd"+i;
			System.out.println(strs[i]);
		}		
				
	}

	
}
