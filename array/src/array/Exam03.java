package array;

public class Exam03 {

	public static int[] selsor(int[] arr){
		int temp;
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				if( arr[i] > arr[j]) {
					temp = arr[i];
					
					arr[i] = arr[j];
					arr[j] = temp;		
		}
		}
		}
		return arr;
	}
		
		
		
		
		
	
	
	
}
