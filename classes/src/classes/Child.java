package classes;

public class Child extends Parent {
	public int c = 30;
	
	void display() {
//		System.out.println(a);   => private 이므로 상속이안됨
		System.out.println(b);
		System.out.println(c);
		System.out.println("child의 메소드임"); //오버라이딩:상속받은 메소드를 재정의
	}

	
	
	
	
	
	
	
	
//실행구간	
	public static void main(String[] args) {
		
		Parent test1 = new Parent();
		test1.display();   
		
		
		Child test = new Child();
		test.display(); //오버라이딩됨.
		
		
	}
	
}
