package classes;

public class Basic {
	int data ;
	
	
	
	Basic(){data = 1;} //생성자 초기화
	
	Basic(int data){ this.data = data;}
	
	
	void getData() {
		System.out.println(this.data);
		
	}
	
	
	
	
	
	void setData(int a) {
		this.data = a;
		
	}
	
	
	
	public static void main(String[] args) {
		

		Basic a = new Basic(6);
		a.getData();
		a.setData(0);
		a.getData();
		
		Basic b = new Basic(); //생성자값 적지 않으면 생성자의 초기화된 값으로 대체됨.
		b.getData();
	
		
	}




}





