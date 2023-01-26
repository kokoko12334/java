package list;

import java.util.ArrayList;
import java.util.Vector;

public class Exam01 {

	
	public static void main(String[] args) {
		
		//배열의 갯수 지정안하고 자동으로 추가, 삭제
		ArrayList list;
		

		list = new ArrayList();
		
		//추가
		list.add(123);
		list.add(1.13);
		list.add("123");
		
		System.out.println(list.get(0));
		System.out.println(list);
		
		
		int intdata = (int)list.get(0); //형변환 해주어야 함.
		System.out.println(intdata);  
		
		//위 문제를 해결하기 위해서 데이터의 타입을 지정해주어야 함
		//<자료형>  generic이라고 함.
		ArrayList<Integer> intList = new ArrayList<Integer>();    //new  뒤에 <>는 써도 되고 안 써도 됨.
		ArrayList<Double> doubleList = new ArrayList<>();    //new  뒤에 <>는 써도 되고 안 써도 됨.
		ArrayList<String> strList = new ArrayList();    //new  뒤에 <>는 써도 되고 안 써도 됨.
		
		
		
		intList.add(123);
		doubleList.add(123d);
		strList.add("123");
		
		//데이터 길이 확인
		System.out.println(list.size());
		
		
		System.out.println(list.contains("123"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
