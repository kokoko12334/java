package string;

import java.util.Scanner;

public class Exam1 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

String data = "ko";

String data2 = new String("ko"); //객체 생성할때 마다 다른 주소를 만듬


System.out.println("data: " + data);	
System.out.println("data2: " + data2);
System.out.println("주소값:"+ (data == data2));
System.out.println("값만비교"+ data.equals(data2));
}
}
