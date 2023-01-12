package condition;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		//1
		
		Scanner sc = new Scanner(System.in);
		
		int count ;
		double total;
		count = sc.nextInt();
		total = count*1000;
		
		if (10 <=count && count<100) {
			total = total*0.9;
		}else if(count>=100) {
			total = total*0.88;
		}
		System.out.println(total);
	}
}
