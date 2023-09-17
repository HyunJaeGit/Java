package api;

public class Ex05_math {
	public static void main(String[] args) {
		// Java의 랜덤은 두 가지로 제공됨
		// 1. Math의 random 메서드
		// 2. Random 클래스
		
		for (int i = 0; i < 20; i++) {
		int ran = (int)(Math.random() * 100) % 16 + 5;	// 100을 곱해줘서 두자리 숫자를 소숫점앞으로 땡김,
														// (int) 강제 형변환, 소숫점을 날림 = 정수부분 2자리 숫자만 남음
		System.out.println("ran = " + ran);				// %21 		>> 랜덤으로 21미만의 숫자가 출력됨
														// %16 + 5 	>> 5이상 21미만의 숫자가 출력됨
		}
		
	}
}
