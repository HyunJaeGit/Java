package input;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 1. 국영수 점수를 입력 받을 변수를 선언
		
		// 2. 1번의 변수에 입력을 받는다.
		
		// 3. 이래와 같이 출력
		// 결과)
		// 성적 : 국 80, 영 66, 수 92
		// 합계 : 238 (79.3)
		
		int kor, eng, mat;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국, 영, 수 점수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + eng + mat;
		double avg = (double)sum / 3;
		
		System.out.println("\n결과)");
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d (%.1f)\n", sum, avg);
		
		sc.close();
	}
}
