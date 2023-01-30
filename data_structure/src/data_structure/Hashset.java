package data_structure;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		
		//set은 중복 허용이 안되고 순서 보장이 안됨 순서를 유지라려면 linkedhashset이 있음
		
		HashSet<Integer> hs1 = new HashSet();
		
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		
		for(int i : hs1) {
			System.out.println(i);
		}
		
		
		
		
		
	}
}
