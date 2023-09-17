package _abstract2;

/*
	인터페이스의 메서드를 바로 구현 후 사용하고 싶다
	기존 순서 : 인터페이스를 상속 받은 클래스 작성 -> 추상 메서드 구현 -> 인스턴스 생성 -> 메서드 사용
	
	익명 클래스
	- 이름 없는 클래스
	- 추상 클래스나 인터페이스를 즉시 구현해서 사용하고 싶을때 사용
	- 하나의 인스턴스만 생성이 가능해서 1회용 클래스
	
	람다식
	- Java8 부터 추가된 구문
	- 함수형 인터페이스를 바로 구현할 수 있는 구문
	
	※ 함수형 인터페이스란?
	- 메서드를 하나만 가지고 있는 인터페이스를 의미
	
*/

public class Ex05 {
	public static void main(String[] args) {
		
		// 1) 익명클래스
		USB usb1 = new USB() {
			@Override
			public void run() {
				System.out.println("USB2.0 구현~");
			}
		};
		
		usb1.run();
		
		// 2) 람다식		
		USB usb2 = () -> {
			System.out.println("USB3.0 구현~");
		};

		usb2.run();
		
//		람다식 조건 : 
//		interface USB {
//			void run(); 
//		} 
//		처럼 '하나의 메서드'만 있는 인터페이스를 구현함 (함수형 인터페이스 만 가능)

		
	}
}
