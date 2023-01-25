package array;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 54, 13, 17, 25,30};
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2 ==0 ) {
				System.out.println("짝수: "+ arr[i]);
				
				
			}else {
				
				System.out.println("홀수: "+ arr[i]);
			}
		}
		
		
		int[] arr2 = new int[3];
		int k,e,m;
		Scanner sc  = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("국어점수 : ");
			k = sc.nextInt();
			if(0<=k && k <=100) {
				arr2[0] = k;
				break;
			}
		}
		while(true) {
			System.out.print("영어점수: ");
			e = sc.nextInt();
			if(0<=e && e<=100) {
				arr2[1] = e;
				break;
			}
		}
		
		while(true) {
			
			System.out.print("수학점수: ");
			m = sc.nextInt();
			if(0<=m && m<=100) {
				arr2[2] = m;
				break;
			}
		}
		int total = 0;
		for(int i = 0; i<arr2.length; i++) {
			total += arr2[i];
			
			
		}
		
		
		System.out.println("총점: " + total );
		System.out.println("평균: " + (total/3));
		
		
		
		
		
		
	}
	
	

}
