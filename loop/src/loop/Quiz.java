package loop;

public class Quiz {
	public static void main(String[] args) {
		
		
		int i = 1;
		int sum = 0;
		
		for(; i<=1000; i++) {
			if(i%3 ==0) {
				if(i%5!=0) {
					continue;
				}
			}
			sum += i;
			
			System.out.println(sum);
		}
		
		
		
		
	}

}
