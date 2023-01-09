package inputs;

import java.util.Scanner;

public class Exam3 {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 
	 System.out.print("정수 입력: ");
	 int data1 = sc.nextInt();            
	 System.out.println("결과: " + data1+1);   //문자열+ 이므로 문자열로 자동현변환
	 
	 
	 
	 
	 System.out.print("정수 입력: ");
	 long data2 = sc.nextLong();
	 System.out.println("정수출력:" + data2);
	 
	 
	 
	 
 	}
}
