package classes;
//super는 변수명이 같을 경우 부모클래스의 변수를 참조하는데에 쓰임
public class Super_child extends Super_parent {
	
	int a = 20;
	int d;
	
	Super_child(){
		
		super(111,1111);   //부모 클래스의 생성자를 불러옴
		//상속을 받으면 부모클래스의 모든 코드가 다 넘어옴
		//그래서 부모의 생성자도 넘어오게 되는데 아무것도 안적으면 super()자동 시행함
		//이떄 생성자의 매개변수가 없으면 오류가 남 그것을 방지하기 위해서 초기화 값을 명시함(부모클래스에서)
		
	}
	
	void display() {
		System.out.println(a);
		System.out.println(this.a);   //해당 객체
		System.out.println(super.a);  //부모클래스
		System.out.println(b);  //부모클래스
		System.out.println(c);  //부모클래스
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Super_child a = new Super_child();
		
		a.display();
	}
	
	
}
