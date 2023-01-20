package loop;

import java.util.Scanner;
import java.util.Random;
public class Exam_while {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean enter = true;
		Random ran_num = new Random();
		int best = 101;
		while(enter) {
			System.out.println("\n== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");
			
			int order = sc.nextInt();
			
			if(order == 1) {
				int cnt = 1;
				int goal = ran_num.nextInt(100)+1;
				
				while(true) {
				System.out.println("\n<< Player Turn >>");	
				System.out.print("Input Number: ");
				int input_num = sc.nextInt();
				if (input_num == goal) {
					System.out.println("플레이어가 정답을 맞췄습니다.  정답: " + goal);
					System.out.println("시도횟수: " + cnt);
					
					if(best>cnt) {best = cnt;}
					break;
					}else if( input_num > goal) {
						System.out.println("Down!!");
						cnt += 1;
						}else {
							System.out.println("UP!!");
							cnt += 1;
						}}
				
				
				
				
			}else if(order ==2) {
				System.out.println("가장 적은 시도 횟수: " + best);
			
		}else {
			enter = false;
		}
		
		
		
		
	}

}
}