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
		
	
		//2차원
		
		int[][] arr2 = new int[5][5];  //5*5배열
		
		int[][] arr3 = new int[5][];  //가변배열
		
		arr3[0] = new int[5];
		arr3[1] = new int[3];
		arr3[2] = new int[2];
		arr3[3] = new int[1];
		arr3[3] = new int[2];
		
		
		//선언 초기화 동시에
		
		int[][] arr4 = new int[][]{
			{10,20,30},
			{1,1,11,2,2},
			{1,3,4,4}
		};
		
		
		
		
	}

	
}

