package data_structure;

import java.util.LinkedList;

public class Linkelst {
	public static void main(String[] args) {
		LinkedList<Integer> arrlist = new LinkedList<>();
		
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		arrlist.add(6);
		arrlist.add(7);
		
		for(int e : arrlist) {
			System.out.println(e);
		}
		
		
		System.out.println("size: " + arrlist.size());
		
		
		// 삭제(index번호)
		arrlist.remove(4);
		
		
		for(int i = 0; i<arrlist.size(); i++) {
			System.out.println("결과: "+arrlist.get(i));
			
		}
		
		//요소 변경
		
		arrlist.set(2, 99);
		for(int e: arrlist) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
	}
}
