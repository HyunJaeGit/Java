package _static;

class People {
	private String name;
	private int age;
	
	private static int eyes = 2;
	
	People(String name, int age)	 {
		this.name = name;
		this.age = age;
	}

	void showInfo() {
		String msg = "%s (%d세) 눈 %d개 \n";
		System.out.printf(msg, name, age, eyes);
	}

	public static int getEyes() {
		// age = 30;	
		// -> 정적 멤버는 일반 멤버를 참조할 수 없다.
		return eyes;
	}
	
	public static void setEyes(int eyes) {
		// this.eyes = eyes;
		// - 정적 메서드에서는 this가 없다
		// - this는 원래 인스턴스 구분을 위해 사용
		
		People.eyes = eyes;
	}
}


public class Ex02 {
	public static void main(String[] args) {
		// 정적 멤버는 인스턴스가 없어도 사용 가능
		// - 클래스 자체의 멤버이르모 클래스만 있으면 바로 사용 가능
		
		System.out.println("사람의 눈 개수 : " + People.getEyes());
		
		
		People p1 = new People("홍길동", 22);
		People p2 = new People("김이동", 36);
		People p3 = new People("이삼동", 16);
		People p4 = new People("박사동", 22);
		
		People.setEyes(3);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		p4.showInfo();
		
		
		
		
		
		
	}
	
}
