package condition;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int data1, data2, data3;
		System.out.print("숫자입력: ");
		data1 = sc.nextInt();
		System.out.print("숫자입력: ");
		data2 = sc.nextInt();
		System.out.print("숫자입력: ");
		data3 = sc.nextInt();
		
		if(data1>= data2 && data1 >=data3) {
			System.out.println(data1);
			}
		else if(data2>= data1 && data2 >=data3) {
			System.out.println(data2);
			}
		else if(data3>= data1 && data3 >=data2) {
			System.out.println(data3);
			}
		
		
		int max;
		
		System.out.print("숫자입력: ");
		data1 = sc.nextInt();
		
		System.out.print("숫자입력: ");
		data2 = sc.nextInt();
		
		if(data1>=data2) {
			max = data1;
			}
		else {
			max = data2;
			}
		if(max%2 == 0) {
			System.out.println("짝수임: " + max);
			}
		
		int sum_;
		System.out.print("숫자입력: ");
		data1 = sc.nextInt();
		System.out.print("숫자입력: ");
		data2 = sc.nextInt();
		
		sum_ = data1+data2;
		if(sum_%2 ==0 && sum_%3 ==0) {
			System.out.println(sum_);
			}
		
		
		
		
		
		
		
	}
}
