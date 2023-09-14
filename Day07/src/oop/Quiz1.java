package oop;

class Car{

	String carname;
	int speed, up, down;		// 알아서 초기화 됨
	
	Car(String model) { 		// 0km/h 시작이라 제외함
		carname = model;
	} 
	 
	void showCar() {
		speed = speed+up-down;
		System.out.printf("%s (%d km/h)\n\n", carname, speed);
	}
	
	void accel(int up) {
		speed = speed+up;
		System.out.printf("%dkm/h 가속\n", up);
		this.showCar();			// 가져와서 생략가능
	}
	
	void break_(int down) {
		speed = speed-down;
		System.out.printf("%dkm/h 감속\n", down);
		this.showCar();			// 가져와서 생략가능
	}

}

public class Quiz1 {

	public static void main(String[] args) {
		// 아래 코드가 실행되게 클래스를 작성한다
	
		Car car = new Car("모닝");			// 필드 : 모델명, 속도
		
		car.showCar();		// 모닝 (0 km/h)
		
		car.accel(30);		// 30km/h 가속
//		car.showCar();-생략	// 모닝 (30 km/h)
		
		car.accel(20);		// 20km/h 가속
							// 모닝 (50 km/h)
		
		car.break_(15);		// 15km/h 감속
							// 모닝 (35 km/h)
	}
}
