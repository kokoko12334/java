package operator;

import java.util.Scanner;

public class Exam5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	String result = (number%2==0) ? "짝수":"홀수";
	String result2 = (number%3==0) ? "3의 배수":"3의 배수아님";
	System.out.println(number+ "="+ result);
	System.out.println(number+ "="+ result2);
	
	int data = sc.nextInt();
	int data2 = sc.nextInt();
	String r = (data == data2) ? "data == data2":(data>data2) ? "data >data2": "data <data2";
	System.out.println(r);         //True          False 면 다음 if 실행
	

	
}

}


