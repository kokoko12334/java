package variables;

public class Exam4 {
	public static void main(String[] args) {
		int data = 123, result;
		char ch = 'D';
		
		data = data + 10;
		ch= 'T' + 3;  //유니코드만큼 이동
		
		result = data + ch ;  //유니코드를 자동으로 int로 변환 후에 연산
		
		System.out.println("data:" + data);
		System.out.println("ch:" + ch);
		System.out.println("ch2:" + (int)ch);//참고로  char은 양수만 표현가능하므로 char타입은 데이터변환(캐스팅: 큰공간을 작은공간으로 이동) 후에 진행해야함
		System.out.println("result:" + result);
		
		
		
		String data2 = "JAVA";
		data2 = data2 + "programming"; //굳이 타입 지정안해도 알아서 문자열로 지정
		
		System.out.println(data2);
		
		
		String name = "김말이";
		int age = 20;
		float height = 173.3f;
		int IQ = 120 ;
		char class_ = 'B';
		System.out.println("이름\t: "+ name);
		System.out.println("나이\t: "+ age);
		System.out.println("키\t: "+ height);
		System.out.println("아이큐\t: "+ IQ);
		System.out.println("등급\t: "+ class_);
	
		
	}
}
