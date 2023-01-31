package classes;

public class Car {
	private String modelName;   //인스턴스필드(인스턴스화하면 생성->힙영역)
	private int modelYear;
	public static int class_filed = 1111;    //클래스필드(객체생성안해도 클래스만 생성하면 메모리에 올라감->메소드영역)
	private int price = 1000;   //명시적 초기화
	
	
	static {class_filed = 1;};  //클래스변수 초기화 블록, 인스턴스변수 는 앞에  static을 빼주면 인스턴스변수 초기화 블록이 됨.
	
	Car(){price = 100;}; //생성자 초기화
	Car(String modelName, int modelYear){     //생성자 (입력)
		this.modelName = modelName;
		this.modelYear = modelYear;
		
	}
	
	public String getModel() {       //인스턴스 메소드 이때 String이면 문자열, int이면 정수, void는 아무것도 반환을 안함.
		return this.modelYear + "년식" + this.modelName;
	}
	
	public static int classMethod() {//객체 생성안하고 클래스에서 바로사용가능
		return 99999;
	}
	
	
	
	
public static void main(String[] args) {
		
		
		Car mycar = new Car("kia", 2020);
		
		System.out.println(mycar.getModel());
		System.out.println(mycar.class_filed); //클래스변수
		System.out.println(Car.class_filed);
	
		Car.class_filed = 100; //클래스 변수 변경 mycar.class_filed도 됨
		
		Car mycar2 = new Car("auto", 2020); //다른 객체에서도 같이 변경이 공유된거 확인
		System.out.println(mycar2.class_filed);
		System.out.println(Car.class_filed);
		
		System.out.println(Car.classMethod()); //클래스메소드
		System.out.println(mycar2.price); 
		
		
		
	}
	
	
	
	
}
