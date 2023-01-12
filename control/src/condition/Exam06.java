package condition;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
	
		
		
	Scanner sc = new Scanner(System.in);
	
	int data;
	
	while(true) {
		System.out.print("숫자입력 :");
		data = sc.nextInt();
		if(data != 0) {break;}
	}
	
	
	if(data%12 == 0) {
		System.out.printf("[%d]은(는) 3의 배수이면서 4의 배수입니다.\n", data);
	}else if(data%3 == 0) {
		System.out.printf("[%d]은(는) 3의 배수입니다.\n", data);
	}else if(data%4 ==0) {
		System.out.printf("[%d]은(는) 4의 배수입니다.\n", data); 
	}else {
		System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.\n",data);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
