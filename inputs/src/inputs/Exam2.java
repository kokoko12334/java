package inputs;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String name1 = sc.next();    // next line 위에 머가 있으면
		
		System.out.println("이름: "+  name1);
		
		
		sc.nextLine();   //line은  enter를 입력으로 인식하기 때문에 얘가 그것을 먹음
		
		
		System.out.print("문자열 입력: ");
		String name = sc.nextLine();    // 공백포함
		
		System.out.println("이름: "+  name);
		
		
	}
	
}
