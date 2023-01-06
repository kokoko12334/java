package inputs;

import java.util.Scanner;

//scanner 적고 ctrl+space해도 위에 나옴
public class Exam1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   //객체 생성 
		System.out.print("이름:");
		String name = sc.next();
		System.out.println("결과:" + name);   //next 메소드를 이용
		
		
		sc.close();
		
		
	}

}
