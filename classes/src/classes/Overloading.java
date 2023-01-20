package classes;

public class Overloading {
/*
 * 메소드오버로딩이란 같은 메소드를 중복하여 정의하는 것을 의미한다.
 * 원래 같은 이름의 메소드를 두개 이상 가지면 안되지면 해당 메소드가 받는
 * 매개변수의 타입, 개수가 다르면 같은이름을 쓸 수 있다. 이를 메소드오버로딩이라고 한다.
 * 이는 또한 객체 지향 프로그래밍의 특징 중 하나인 다형성을 구현하는 방법 중 하나이다.
 * (이떄 같은 매수변수 개수, 타입을 같은 것을 시그니처가 같다고 한다.)
 * 
 * 
 */
	
	void display(int num1){System.out.println(num1);}
	void display(int num1, int num2) {System.out.println(num1+num2);}
	

	public static void main(String[] args) {
	 Overloading test = new Overloading();
	 test.display(1);
	 test.display(2,3);
	 
}

}
