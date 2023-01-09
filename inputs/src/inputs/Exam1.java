package inputs;

import java.util.Scanner;

//scanner 적고 ctrl+space해도 위에 나옴
public class Exam1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   //객체 생성 
		System.out.print("이름:");
		String name = sc.next();
		String name1 = sc.next();
		
		System.out.println("결과:" + name);   //next 메소드를 이용
		System.out.println("결과:" + name1);   //next 메소드를 이용  띄어쓰기로 구분
		
		
		
		
	}

}

