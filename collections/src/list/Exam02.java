package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();
		ArrayList<String> names = new ArrayList();
		
		
		Scanner sc = new Scanner(System.in);
		boolean enter = true;
		while(enter) {
			System.out.println("\n1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			
			int order = sc.nextInt();
			
			switch(order) {
			
				case 1: {	System.out.print("이름: ");
							String name = sc.next();
							while(names.contains(name)) {
						
							System.out.println("똑같은 이름이 있습니다. 다시 입력해주세요.");
							
							System.out.print("이름: ");
							name = sc.next();
							}
							
							names.add(name);
							
							System.out.print("연락처: ");
							int num = sc.nextInt();
							
						
						}    
				
				case 2: {System.out.print("확인할 이름: ");
							String name = sc.next();
							int idx = names.indexOf(name);
							try{
							System.out.print("이름:"+names.get(idx));
							System.out.print("\n연락처:" +numbers.get(idx));
							}catch(Exception e){System.out.println("목록에 없습니다.\n");}
								break;}
				
				case 3: {for(int i = 0; i<numbers.size(); i++) 
						{System.out.println((i+1)+" 이름: "+ names.get(i)+"  연락처: "+ numbers.get(i));}
				
						if( numbers.size() != 0) {
						System.out.print("삭제할 연락처 정보(몇번째 인지) : ");  int idx = sc.nextInt();
						
						names.remove(idx-1); numbers.remove(idx-1);}
						else {System.out.println("연락처 목록이 없습니다.\n");}
						break;
						}
				
				case 4:{for(int i = 0; i<numbers.size(); i++) {System.out.println("이름: "+ names.get(i)+"  연락처: "+ numbers.get(i));} break;}
						
				
				case 5: enter = false;
			
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
