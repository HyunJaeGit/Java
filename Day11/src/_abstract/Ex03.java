package _abstract;

import other.Animal;
import other.FlyAble;

/*
	Java 는 클래스의 다중 상속이 불가능
	- 기능을 많이 물려받아서 강력한 상속임
	- 하지만 충돌을 많이 내기 때문에 안정성을 해침
	
	클래스 상속			: 기능을 물려 받아서 '확장'에 중점
	인터페이스의 상속	: 특정 기능을 '구현'에 중점
 */

class Bird extends Animal implements FlyAble {
	// Bird 는 FlyAble로 업캐스팅이 가능 (날수있다)
	
	@Override
	public void bark() {
		System.out.println("짹짹~");
	}

	@Override
	public void fly() {
		// type = "윙";
		System.out.println(type + "로 날아간다");
	}
}

class Airplain implements FlyAble {
	@Override
	public void fly() {
		System.out.println("엔진의 가속으로 날아간다");	
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		Airplain air = new Airplain();
		
		// 자~ 동물(Animal 상속받은) 친구들 모여라
		Animal[] anis = new Animal[] { cat, dog, bird };
		
		for (int i = 0; i < anis.length; i++) {
			anis[i].bark();
		}	
		System.out.println();
		
		// 자~ 날수있는(Flyable을 상속받은) 친구들 모여라
		FlyAble[] flys = new FlyAble[] { bird, air };
		
		for (int i = 0; i < flys.length; i++) {
			flys[i].fly();
		}
			
		// ※ 여기서 bird를 살펴보면,
		// - Animal를 상속 받아서 Animal로도 상속 가능하고,
		// - FlyAble를 상속 받아서 FlyAble로도 상속 가능하다
		/*
				동물		|	날수있는
						|
			(개	고양이     <새)	      비행기>
			
		 */
	}
}
