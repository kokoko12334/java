package map;

import java.util.HashMap;

public class Exam01 {

		public static void main(String[] args) {
			
			
			HashMap<Integer, String> hm = new HashMap();
			
			hm.put(0, "김밥");
			hm.put(1, "감자");
			
			System.out.println(hm.get(0));
			System.out.println(hm.get(1));
		}
		
		
		
		
}
