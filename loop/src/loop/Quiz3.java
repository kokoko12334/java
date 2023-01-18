package loop;

public class Quiz3 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i = 1; i<=1000; i++) {
			if(i%12 ==1) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("합: " + sum);
		
		int day = 2;
		long total = 1L;
		i = 1;
		for(; day<=30; day++) {
			i *=2;
			total += i;
			
		}
		System.out.println("총저축: "+ total);

		
		
		int box = 1;
		total = 1L;
		long j = 1L;
		for(; box<64; box++) {
			j *=2;
			total += j;
			System.out.println("총합: "+ total);
			
		}
	
		
		}
}
