package loop;

public class Quiz {
	public static void main(String[] args) {
		
		
		int i = 1;
		int sum = 0;
		
		for(; i<=1000; i++) {
			if(i%3 !=0) {
			 sum += i;
			}else if(i%5 == 0) {
				sum += i;
			}
				
			System.out.println(sum);
		}
		
		
		
		
		i = 1;
		sum = 0;
		while(true) {
			sum += i;
			
			if(sum>=10000) {
				break;
			}
			i += 2;
		}
				
		System.out.println("합: "+ sum);
		System.out.println("i: "+ i);
		
		
		}

}
