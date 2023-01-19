package loop;

import java.util.Scanner;

public class Exam_while {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int order ;
		String id = "None";   // 먼저정의하면 해당 변수의 주소값지정
		int passwd = 0;
		boolean enter = true;
		while(enter) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 나가기");
			
			order = sc.nextInt();
			
			if(order == 1) {
				System.out.print("저장할 아이디 입력: ");
				id = sc.next();
				System.out.println(id);
				System.out.print("저장할 비밀번호 입력");
				passwd = sc.nextInt();
			}
			else if(order ==2) {
				System.out.print("아이디 입력: ");
				String id_input = sc.next();
				System.out.print("비밀번호 입력: ");
				int passwd_input = sc.nextInt();
				if (id.equals(id_input) && passwd == passwd_input) {
					System.out.println("인증 성공 !!!");
				}else {System.out.println("인증 실패!!!");}
			}
			else {enter = false;}
			
		}
		
		
		
		
		
	}

}
