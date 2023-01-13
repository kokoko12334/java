package switchcase;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 우리집 등록");
		System.out.println("2. 회사 등록");
		System.out.println("3. 등록 보기");
		System.out.println("4. 종료");
		
		boolean access = true;
		String address, job;
		address = job = "";
		
		while(access) {
			System.out.print("입력>>");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			
			case 1: System.out.print("집: "); address = sc.nextLine(); break;
			case 2: System.out.print("회사: "); job = sc.nextLine(); break;
			case 3: System.out.println("우리집: "+ address +"\n"+ "회사: "+ job); break;
			case 4: access = false;
			}
			
			
		}
		
		
		
		
		
	}
}
