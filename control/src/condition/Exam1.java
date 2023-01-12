package condition;

import java.util.Scanner;

public class Exam1 {
public static void main(String[] args) {

		int data;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		data = sc.nextInt();
		
		
		
		if(data > 10) {
			System.out.println("10초과");
		}else {
			System.out.println("10이하");
		}

		
	
		
		
	}
}
