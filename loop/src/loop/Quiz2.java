package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	 
		String num = sc.nextLine();
		String[] num2 = num.split(" ");
		
		int n1 = Integer.parseInt(num2[0]);
		int n2 = Integer.parseInt(num2[1]);
		int total = 0;
		int i;
		if(n1>n2) {
			for(i = n2 ; i<=n1; i++) {
				total += i;
				}
		}else{
			for(i = n1; i<=n2; i++) {
				total += i;
				}
		}
		System.out.println("합: "+total );
		
		
		
		int data = sc.nextInt();
		boolean result = true;
		for (i = 2; i <data; i++) {
			if(data%i ==0) {
				result = false;
			}
			
		}
		if(result) {
			System.out.println(data+ "는 소수이다.");
		}
		else {
			System.out.println(data + "는 소수가 아니다.");
		}
		
		
		
		sc.close();
		
		
		
	}	
}
