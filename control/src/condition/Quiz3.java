package condition;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		year = sc.nextInt();
		
		
		if(year%400 ==0) {
			System.out.println("윤년"+year);
		}else if(year%100 ==0) {
			System.out.println("평년"+year);
		}else if(year%4 ==0) {
			System.out.println("윤년"+year);
		}else {
			System.out.println("dd");
		}
		
		
		
		
	}
}

