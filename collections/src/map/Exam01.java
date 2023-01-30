package map;

import java.util.HashMap;
import java.util.Scanner;

public class Exam01 {

		public static void main(String[] args) {
			
			
			HashMap<Integer, String> hm = new HashMap();
			
			hm.put(0, "김밥");
			hm.put(1, "감자");
			
			System.out.println(hm.get(0));
			System.out.println(hm.get(1));
			
			
			
			// key val 값 확인
			System.out.println("key값: "+hm.keySet());
			System.out.println("val값: "+hm.values());
			
			
			
			for(String e: hm.values()) {
				System.out.println(e);
			}
			
			
			
			
		}
		
		
		
		
		
}
