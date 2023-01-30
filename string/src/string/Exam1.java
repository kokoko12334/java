package string;

import java.util.Scanner;

public class Exam1 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

String data = "ko";
String data3 = "ko";

String data2 = new String("ko"); //객체 생성할때 마다 다른 주소를 만듬
String data4 = new String("ko"); //객체 생성할때 마다 다른 주소를 만듬


System.out.println("data: " + data);	
System.out.println("data2: " + data2);
System.out.println("data3: " + data3);

System.out.println("주소값 비교data2-data: "+ (data == data2));
System.out.println("주소값 비교data1-data3: "+ (data == data3));
System.out.println("주소값 비교data3-data4: "+ (data4 == data3));
System.out.println("값만비교"+ data.equals(data2));



String str = new String(" ddd   ");
System.out.println(str);
System.out.println(str.trim()); //왼쪽, 오른쪽 모든 공백 제거







}

}
