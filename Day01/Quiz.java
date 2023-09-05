package output;

public class Quiz {
	// 1. main 함수를 직접 작성
	// 2. main 안에서 출력문을 작성, 아래 결과를 출력
	// 결과)
	// 이름 : 홍길동 (24세)
	// 신장 : 176.3cm
	// 주소 : 부산 광역시 해운대구 센텀
	
	public static void main(String[] args) {
		System.out.println("결과)");
		System.out.println("이름 : 홍길동 (24세)");
		System.out.println("신장 : 176.3cm");
		System.out.println("주소 : 부산 광역시 해운대구 센텀");
		
		System.out.printf("이름 : 홍길동 (%d세)", 24);
	}
}
