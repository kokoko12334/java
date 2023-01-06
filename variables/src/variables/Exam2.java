package variables;

public class Exam2 {
	public static void main(String[] args) {
		
		//main 안에서는 {}를 기준으로 전역, 지역변수를 나눔
		
		
		
		int data1 = 10; //전역변수
		
		if(true) {
			System.out.println(data1);
		}
		
		if(true) {
			int data2 = 20;   //지역변수
			System.out.println(data2);
		}
	//	System.out.println(data2);  지역변수라서 오류남
	
			
	}

}
