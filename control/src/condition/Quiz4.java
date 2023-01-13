package condition;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		//1
		
		Scanner sc = new Scanner(System.in);
		
		int count ;
		int total;
		count = sc.nextInt();
		total = count*1000;
		
		if (10 <=count && count<100) {
			total = total*90/100;
		}else if(count>=100) {
			total = total*88/100;
		}
		System.out.println(total);
	
	
		System.out.print("탑승 시간 입력(분단위): ");
		int time = sc.nextInt();
		
		if(time <= 30) {
			total = 30000;
		}else if(time % 10 != 0){
			int fee = ((time-30)/10)+1;
			total = 30000+(fee*5000);
			
		}else {
			int fee = (time-30)/10;
			total = 30000+(fee*5000);
		}
		System.out.println(total);
		
	}
}





