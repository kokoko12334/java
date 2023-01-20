package classes;

public class Abstract_sub extends Abstract_class {
//상속받으면  abstract는 무조건 오버라이딩을 해야 인스턴스화를 진행할수 있음.
//이는 자식클래스에서 해당 메소드를 강제할 때 쓰임.
	void must(){System.out.println("must함");}
	
	
	
	
	
	
	public static void main(String[] args) {
		Abstract_sub test = new Abstract_sub();
		
		test.must();
		test.normal(); //부모클래스에서 abstract없으면 오버라이딩 할필요없음.
	}
	
	
}
