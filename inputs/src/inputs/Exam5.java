package inputs;

public class Exam5 {
public static void main(String[] args) {
	
	
	
	
	
	
	String strData = "1234";
	
	int intData;   // 여기서 해야 전역변수로 됨 try안에는 지역변수
	
	try {
	intData = Integer.parseInt(strData);
	System.out.println(intData);
	System.out.println(strData +1);
	}
	catch(Exception e) {
		System.out.println("숫자만 가능: " + e);
	}
	
	
	
	}	
}
