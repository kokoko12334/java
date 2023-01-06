package variables;

public class Exam1 {
	public static void main(String[] args) {
		// totalScore 처럼 단어두개면 두번째는 대문자로 
		//숫자형 뒤로갈수록 더 높은 숫자 할당 가능   바이트가 많은곳에서 적은 곳으로 가면 데이터손실이 날 수 있음
		//정수
		byte a = 1 ;        //1 바이트
		short b = 111;      //2바이트
		int c = 1111;       //4바이트
		long d = 123333L ;  //8바이트   
		System.out.printf("a:%d, b:%d, c:%d, d:%d", a,b,c,d);
		
		
		//실수(기본형이   double이라서 float쓰려면 뒤에 F를 붙혀야함)
		
		float a1 = 1.22F;   //4 바이트
		double a2 = 1.2222222;   //8바이트
		System.out.println("\n");
		System.out.printf("a1: %f, a2: %f", a1,a2);
		
		
		//문자
		char a3 = 65; //아스키코드, 작은따옴표사용   2바이트
		String a4 = "aaaa"; // 문자열, 여러 문자개수 가능, 큰따옴표 사용
		System.out.println("\n");
		System.out.printf("a3: %s, a2: %s", a3,a4);
		
		
		//불리언
		boolean a5 = true;    //1바이트 
		boolean a6 = 7<5 ;
		System.out.println("\n");
		System.out.printf("a5: %s, a6: %s", a5,a6);
		
		
		
		
		
	}
}
