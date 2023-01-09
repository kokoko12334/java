package inputs;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int korean, english, math;
		
		System.out.print("당신의 이름은 무엇입니까?");
		String name  = sc.next();
		System.out.print(name+" 님의 국어 점수");
		korean = sc.nextInt();
		System.out.print(name+" 님의 영어 점수");
		english = sc.nextInt();
		System.out.print(name+" 님의 수학 점수");
		math = sc.nextInt();
		
		int sum = korean+english+math;
		System.out.println("====================");
		System.out.println("이 름 : " + name);
		System.out.println("====================");
		System.out.println("국 어 : "+ korean);
		System.out.println("영 어 : "+ english);
		System.out.println("수 학 : "+ math);
		System.out.println("====================");
		System.out.println("합 계 : "+ sum);
		System.out.println("합 계 : "+ (korean+english+math)); 
		System.out.println("====================");
		
		
		
		
		//System.out.println("합 계 : "+ korean+english+math);  문자열안에 +를 같이쓰면  인트형이 문자열로 자동 형변환됨.
		//System.out.println("합 계 : "+ (korean+english+math));  쓰려면 괄호로 연산먼저 한후에 가능
	}
}
