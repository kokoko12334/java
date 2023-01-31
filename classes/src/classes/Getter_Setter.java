package classes;

public class Getter_Setter {

	
	private int age;
	private String name;
	private int kor,eng, sum;
	private double average;
	//alt+shilf+enter (자동생성기능) getter,setter 지정한 변수 기준임. 이떄 setter는 생성자가 아니고 메소드임 즉 객체만들고 다 하나씩 메소드를 쓰면서 데이터를 입력시켜야됨
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		boolean nameCheck = name.matches("[a-z]{2,3}"); //match는 정규표현식을 이용한 조건
		if(nameCheck) {
			this.name = name;
			return nameCheck;
		}else {
			return nameCheck;
		}
		
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAverage() {
		return average; 
	}
	public void setAverage(double average) {
		this.average = average;
	}

	public static void main(String[] args) {
		Getter_Setter a = new Getter_Setter();
		a.setAge(1);
		a.setName("asd");
	
		System.out.println(a.getName());
		
	}

}










