package outputs;

import java.util.Scanner;

/*  범
	위
	주
	석 */
public class Exam1 {
	
	public static void main(String[] args) {
		
		System.out.println("abc"); // 출력하고 엔터
		System.out.print("abc");   // 그냥 출력
		
		
		
		Scanner sc = new Scanner(System.in);   // Scanner를 이용하여 인풋넣기
		System.out.println("입력:");            
		String inputData = sc.next();
		
		System.out.println("입력받은데이터:"+ inputData);
		
		//format 출력 %s는 문자열 %d는 정수 %f는 실수
		int data2 = 1;
		float data3 = 1;
		System.out.printf("출력결과 %s 는  %d   %f", inputData, data2, data3);
		
		
		System.out.println("he \n llow \t world"); // 개행문자
		sc.close();  // scanner(system.in)을 하면 닫아줌
		
		
		//참고로 해당 코드에서  alt+ctrl 방향키아래 하면 해당코드복사본을 아래로 붙혀넣음
	
		
		
		
	}

	
	
}

