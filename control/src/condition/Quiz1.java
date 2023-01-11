package condition;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int data = sc.nextInt();
		
		
		if(data%3 == 0) {System.out.println("3의배수");}
		if(data<0){
			data = -data; 
			}
		System.out.println(data);
		
		
		int data2;
		data = sc.nextInt();
		data2 = sc.nextInt();
		if(data >= data2) {
			System.out.println(data);
		}else {
			System.out.println(data2);
		}
		
		
	}
}
