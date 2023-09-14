package accessModifier;

import other.Child;
import other.Ball;

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 클래스를 other패키지에 작성
		// 필드는 모두 private 처리한다
		
		Child minsu = new Child("민수	");
		Child jinho = new Child("진호	");
		
		minsu.showInfo();
		jinho.showInfo();
		
		Ball base = new Ball("야구공");
		
		minsu.takeBall(base);
		minsu.showInfo();
		jinho.showInfo();
		
		minsu.throwBall(jinho);
		minsu.showInfo();
		jinho.showInfo();
		
	}
}
