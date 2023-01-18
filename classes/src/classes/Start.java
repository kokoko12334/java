package classes;
import classes.Person;
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person me = new Person();
		Person you = new Person("you");
		me.printName();
		you.printName();
		
		
		System.out.println(me.name);
		System.out.println(me.age);
		System.out.println(me.birthday);
	
		

		
		
		
	}

}
