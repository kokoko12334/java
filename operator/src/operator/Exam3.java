package operator;

public class Exam3 {
  public static void main(String[] args) {
	  	
	  
	  int data1;
	  double data2;
	  data1 = 5; ++data1;
	  System.out.println("++data1 = " + data1);
	  
	  data1 = 5; data1++;
	  System.out.println("data1++ = " + data1);
	  
	  data2 = 11.2;
	  ++data2;
	  System.out.println("++data2 = " + data2);
	  
	  data2 = 11.2;
	  data2++;
	  System.out.println("data2++ = " + data2);
	  
	  
	  
	  int data;
	  data = 10;
	  System.out.println(data++);  //++하기전에 출력하고 
	  System.out.println(data); //그다음부터 반영
	  data = 10;
	  System.out.println(3*++data); // 10+1 먼저하고 *3
		
}
}
