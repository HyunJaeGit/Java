package input;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 이름 나이 신장 성별을 저장받을 변수를 선언
		// - 단, 성별은 char로 선언
		
		// 2. 1번의 변수에 Scanner를 활용해서 키보드 값을 입력
		
		// 3. 결과는 아래와 같이 출력
		// 결과)
		// 이름 : 홍길동 (21세, 남)
		// 신장 : 175.3cm
		
		// 1)
		String name;
		int age;
		char gender;
		double height;
		
		// 2)
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.print("성별 입력 [남/여]: ");
		gender = sc.next().charAt(0);
		
		System.out.print("신장 입력 : ");
		height = sc.nextDouble();
		
		// 3)
		System.out.println("\n결과)");
		System.out.printf("이름 : %s (%d세, %c)\n", name, age, gender);
		System.out.printf("신장 : %.1fcm", height);
		
		sc.close();
	}
}
