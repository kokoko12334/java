package inputs;

import java.io.IOException;

public class Exam4 {
	public static void main(String[] args) throws IOException {
		
		/*
		throw: 예외 전가
		try/catch: 예외처리(직접)
	
		*/
		System.out.print("입력: ");
		
		int data = System.in.read();  // 오직 한글자만 입력이 되고 유니코드로 변환함
		
		char c = (char) data;
		System.out.println(data);
		System.out.println(c);
		
		

		
	
		
		
	}
}



 








