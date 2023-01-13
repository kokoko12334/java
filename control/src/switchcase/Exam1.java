package switchcase;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//입력한 값을 바로 찾아감( O(1))
		Scanner sc = new Scanner(System.in);
		
		String select = sc.next();
		
		char s = select.charAt(0);
		switch(s) {
		case 'A': System.out.println("case a"); break;
		case 'B': System.out.println("case b"); break;
		default : System.out.println("default");
		
		}
		
		
		
	}
}


















