package array;
import java.util.Scanner;

import array.Exam03;

public class Exam04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("배열의 길이를 입력해주세요.: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print((i+1) +"번째 값 : ");
			arr[i] = sc.nextInt();
			
			
			
		}
		
		System.out.print("배열에 입력된 값은: ");
		for(int e: arr) {
			System.out.print(e+ " ");
			
		}
		System.out.print("입니다.\n");
		
		
		int[] arr2 = Exam03.selsor(arr);
		
		System.out.print("정렬된 값은: ");
		for(int e: arr2) {
			System.out.print(e+ " ");
			
		}
		System.out.print("입니다.");
		
		
	}
}
