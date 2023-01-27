package set;


import java.util.HashSet;
import java.util.Iterator;

public class Exam01 {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet();
		hs.add("라면"); hs.add("김밥");
		hs.add("순대"); hs.add("김밥");
		System.out.println("HashSet: "+ hs);
		
		
		
		boolean bool;
		bool = hs.add("김밥");
		System.out.println(bool);  //목록에 있으면  false반환
		
		//삭제
		
		 hs.remove("김밥");
		 System.out.println("HashSet: "+ hs);
		 
		 
		 //hash맵 출력방법(따로)
		 Iterator<String> it = hs.iterator();
		 while(it.hasNext()) {       //다음요소 확인 없으면 false
			 
			 String name  = it.next(); //다음요소 반환
			 System.out.println(name);
		 }
		  
		 //iterator랑 같은 기능을 하는 거
		 for(String e: hs) {
			 System.out.println(e);
		 }
		 
		 while(it.hasNext()) {
			 
			 it.remove();
			 
		 }
		 System.out.println(hs);
		 
		 
	}
}
