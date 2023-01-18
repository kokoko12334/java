package loop;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean answer;
		int i, j;
		for(i =2; i<=num; i++) {
			answer = true;
			for(j = 2; j < i; j++ ) {
				
				if(i%j == 0) {answer = false; break;}
				
			}if(answer) {System.out.println(i);}
	}
		
		
		
		int x, y;
		for(x = 0; x<=10; x++) {
			for(y =0; y<=10; y++) {
				if(3*x+2*y ==10) {
					System.out.println("x:" + x + "   y:"+ y);
					System.out.println("합: " + (3*x+2*y));
					break;
					
				}
				
			}
		}
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
