package classes;

public class Super_parent {

	
	int a = 10;
	int b;
	int c;
	
	Super_parent(){  //super() :  매개변수 입력 안한상태에서는 이게(기본값)이 실행
		b = 111;
		c = 1112;
		
	}
	
	Super_parent(int n, int nn){  //  super(매개변수)하면 불러오게 되는 생성자
		b = n;
		c = nn;
	}
	
	
	//super.변수면 부모클래스의 변수를 불러오고
	//super()는 자식클래스의 생성자 안에서 쓰이며, 부모클래스의 생성자를 참고할 때 쓰임
}


