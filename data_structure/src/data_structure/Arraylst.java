package data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Arraylst {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylst = new ArrayList();
		
		
		arraylst.add(3);
		arraylst.add(4);
		arraylst.add(5);
		arraylst.add(6);
		arraylst.add(7);
		
		
		//for, enhanced for문을 이용한 출력
		for(int i = 0; i<arraylst.size(); i++) {
			System.out.println(arraylst.get(i));
			
		}
		for(int e : arraylst) {
			System.out.println(e);
			
		}
		
		//삭제
		arraylst.remove(0);
		
		//sort (삽입, 합병정렬사용 nlogn)
		Collections.sort(arraylst);
		
		
		//요소변경
		arraylst.set(2, 1);
		
		//iterator 이용
		Iterator<Integer> iter = arraylst.iterator();
		
		while (iter.hasNext()) {

		    System.out.print(iter.next() + " ");

		}
		
	
		
		
		
		
		
		
		
		
		
	}
	
}
