package accessModifier;

class Car {
	private String model;
	private int speed;

	private int n = 4;						// 좌석수
	private Human[] sits = new Human[n];	// 좌석	(0번이 운전석)
	
	Car(String model,int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	void showCar() {
		System.out.printf("모델명 : %s (%dkm/h)",model , speed);
	}
	
	
	void accel(int speed) {
		if (Human[0]==1) {
			this.speed += speed;
			System.out.printf("현재 속력: %dkm/h\n", this.speed);
		} else {
			System.out.println("운전자가 없어 가속할 수 없습니다.");
		}
	}
	
	
	void rideOn(String Human, int sits[]) {
		for (int i=0; i< )
	}
}


public class Quiz2 {
	public static void main(String[] args) {
		Car car = new Car("아우디",0);
		
		Human h1 = new Human("홍길동");
		Human h2 = new Human("김양식");
		Human h3 = new Human("차타고");
		Human h4 = new Human("알파고");
		
		car.rideOn(h1, 0);		// 자동차에 사람이 탑승
								// 지정한 자리(0)에 탑승 시킨다
								// 이미 사람이 있다면 경고
		
		car.showCar();			// 모델명, 속도, 탑승자
		car.accel(30);			// 가속메서드
								// 운전자가 없으면 가속 불가
		
	}
}
