package _static;

// 정적 멤버는 인스턴스가 공유 한다는 특징이 있다
// 하지만, 이 특징보다 인스턴스 없이 사용 가능한 특징이 좀 더 많이 활용 됨

public class Ex03 {
	public static void main(String[] args) {
		
		// Math math = new Math(); (대표적인 정적 메서드(클래스))
		// - Math는 생성자가 존재하지 않아 인스턴스 생성이 불가능
		// - 모든 기능은 static으로 구현되어 있음
		
		System.out.println("자연 상수 : " + Math.E);
		System.out.println("원주율 : " + Math.PI);
		
		System.out.println("\n절대값 : " + Math.abs(-5));
		System.out.println("거듭 제곱 : " + Math.pow(2,10));
		System.out.println("제곱근 : " + Math.sqrt(2));
		System.out.println("2π의 각도 : " + Math.toDegrees(2 * Math.PI));
		
		System.out.println("sin 90 : " + Math.sin(Math.PI / 2));
		
		
		
	}
}
