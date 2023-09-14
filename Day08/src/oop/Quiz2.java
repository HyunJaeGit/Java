package oop;

class Person {
	String name;
	
	Person(String name)	{
		this.name = name;
	}
}

class Car {
	
	String model, name;
	int speed;
	Person driver;
	
	Car(String model) {
		this.model = model;
	}
	
	void showCar() {
		String name = (driver == null) ? "x" : driver.name;
		
		System.out.printf("%s (%d km/h, %s)\n", model, speed, name);
	}
	
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("\n운전자가 없습니다!!!");
			return;
		}
		this.speed += speed;
		
		System.out.printf("\n%d km/h 가속 \n", speed);
		showCar();
	}
	
	void takeOn(Person driver) {
		this.driver = driver;
		
		System.out.printf("\n%s(이)가 %s에 탑승\n", driver.name, model);
	}
	
	void break_(int speed) {
		this.speed -= speed;
		
		System.out.printf("\n%d km/h 가속 \n", speed);
		showCar();
	}
	
	
	void takeoff() {
		
		if (speed != 0) {
			System.out.println("\n지금은 내릴 수 없습니다!!!");
			return;
		}
		else {
			
			System.out.println("\n하차합니다\n");

			driver = null;
			showCar();
		}
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 구현
		Person hong = new Person("홍길동");
		Car car= new Car("모닝");
		
		car.showCar();
		
		car.accel(30);
		
		car.takeOn(hong);

		car.accel(30);
		
		car.break_(20);
		
		car.takeoff();
	}
}
