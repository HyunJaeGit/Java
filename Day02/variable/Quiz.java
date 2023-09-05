package variable;

public class Quiz {
	public static void main(String[] args) {
		// 1. 이름, 나이, 신장, 성별, 주소를 저장할 변수를 선언
		// 2. 1번의 변수에 값을 채움
		// 3. 채운 변수를 아래와 같이 출력
		// 결과)
		// 이름 : 홍길동 (23세, 남)
		// 신장 : 167.9cm
		// 주소 : 부산 광역시 해운대구 센텀로
		
		// 1. 변수선언
		String name, gender, address;
		int age;
		double height;
		
		// 2. 변수에 값을 채움
		name = "홍길동";
		age = 23;
		gender = "남";
		height = 167.9;
		address = "부산 광역시 해운대구 센텀로";
		
		// 3. 출력
		System.out.printf("이름: %s (%d세, %s)\n", name, age, gender);
		System.out.printf("신장 : %.1fcm\n", height);
		System.out.printf("주소 : %s\n", address);
		
		// ※ printf() : format(형태)를 잡아 놓고 데이터를 채우는 방식
		// %s : String, 문자열 자리
		// %c : Character, 문자 자리
		// %d : Decimal, 10진수 자리
		// %f : float, 실수 자리 (기본 소수점 6자리 출력, %.nf라고 쓰면 n자리 만큼 출력)
	}
}
