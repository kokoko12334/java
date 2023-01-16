package loop;
public class Loop {
	 public static void main(String[] args) {
		 
		int i; 
		 
		for(i = 1; i <= 4; i+=1) {
			System.out.println("hello");
		}
		 
		 
		int sum = 0; 
		for(i = 1; i<=100; i++) {
			sum += i;
			if(sum == 528) {
				System.out.println("총합: " + sum);
				System.out.println("i값: "+ i);
				break;
			}
			
			
		}
		
		int j;
		for(i = 1; i<=21; i += 5) {
			System.out.print(i+"  ");
			for(j = 1; j<=4; j++) {
				System.out.print(i+j+ "\t");
				
			}
			System.out.print("\n");
		}
	
		                      
		 
		 
		 
	}
}
