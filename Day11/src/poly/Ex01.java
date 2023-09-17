package poly;

// 다형성(polymorphism) : 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미
//
// 다형성 조건
// 1. 상속
// 2. 오버라이딩

class Figure	{
	void draw() {
		System.out.println("도형을 그린다");
	}
}
class Triangle extends Figure {
	@Override
	void draw() {
		super.draw();
	}
}
class Square extends Figure {

	@Override
	void draw() {
		super.draw();
	}
	
	
}
class Circle extends Figure {
	
	 @Override
	void draw() {
		super.draw();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		
		Figure fig = new Figure();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		// 업캐스팅으로 자식 객체를 묶어준다
		Figure[] figs = new Figure[] { fig, tri, squ, cir };
		
		// 묶은 도형들에게 그려라는 명령을 내린다
		for (int i = 0; i < figs.length; i++) {
			figs[i].draw();		// 업캐스팅이 되더라도 자식에서
								// 오버라이드된 메서드가 실행된다
			}
		
		
	}
	
}
