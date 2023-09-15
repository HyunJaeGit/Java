package inheritance;

import other.Person;

class Airplane {
	
	private int n = 10;
	private Person[] sits = new Person[n];

	void rideOn(Person per) {
		for (int i = 0; i < n; i++) {
			if (sits[i] == null) {
				System.out.println(per.getName() + "님 탑승~");
				
				sits[i] = per;
				return;
			}
		}
		System.out.println("좌석이 부족합니다 ㅠㅠ");
	}

	void list() {
		System.out.println("\n 승객목록");
		
		for (int i = 0; i < n; i++) {
				System.out.print(i + 1 + "번 좌석 : ");
				
				if (sits[i] != null) {
				sits[i].showInfo();}
				else {System.out.print("-- 빈좌석 --\n");}
			}
		} 
	
	void emergency(Person per) {
		System.out.println("\n긴급상황, 기내에서 의사를 찾습니다");
		
		for (int i = 0; i<n; i++) {
			
			if (sits[i] instanceof Doctor) {
			Doctor tmp = (Doctor) sits[i];
			tmp.cure(per);
			return;
			}
		}
		System.out.println("\n의사가 존재하지 않습니다...");
	}



}	

public class Quiz2 {
	public static void main(String[] args) {
		Student stu	= new Student("홍길동", 19, 93);
		Police pol	= new Police("이민철", 29, "경장");
		Doctor doc	= new Doctor("이국종", 43, "내과");
		Person per	= new Person("박수진", 30);
		
		
		Airplane air = new Airplane();
		
		air.rideOn(stu);		// 비행기에 '사람' 이 탑승하는 메서드
		air.rideOn(pol);		// 좌석이 부족하면 탑승 불가능
		air.rideOn(doc);
		air.rideOn(per);	
		
		air.list();				// 탑승객 목록을 출력
		
		air.emergency(stu);		// 긴급상황 메서드
								// 기내에서 의사를 찾아서 전달된 사람을 치료
								// 만약 의사가 없으면 없다고 출력
	}
}
