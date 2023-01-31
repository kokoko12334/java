package class2;
import classes.Person;

public class Another extends Person {

	Another(){super();}
	
	
	
	
	
	
	public void print() {

	System.out.println(name);
	System.out.println(super.age); 
	 
	 
}
public static void main(String[] args) {
	
	Another a = new Another();
	
	a.print();
	a.testprint();
	System.out.println(Another.class_filed); //상속받으면 클래스변수에도 접근가능
	System.out.println(a.class_filed);
}
	
}
