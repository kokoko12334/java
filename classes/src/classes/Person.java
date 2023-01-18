package classes;

public class Person {
	//생성자의 기본값
	public String name = "me"; // 어디든
	protected int age = 3;   //같은 패키지안에서만+ 파생클래스
	String birthday = "3/3"; //같은패키지안에서만
	private int weight = 30;//해당 클래스에서만
	public Person() {
	}   
	
	//생성자
	public Person(String name) {
		
		this.name = name;
	}
	
	public void printName() {
		System.out.println(this.name);
		
	}
	
	
	
	
}
