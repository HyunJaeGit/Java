package loop;

import java.util.Scanner;

// 무한 반복
// 불특정 횟수 반복은 무한 반복 형태로 사용하기도 한다.


public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.print("정수 입력(0: 종료)>> ");
			n = sc.nextInt();
			
			if (n <= 0) break;	// if문은 break의 영향을 받지 않음
								// - 조건을 걸어주기 위함
			
			System.out.println("n = " + n + "\n");
		}
		
		System.out.println("프로그램 종료~");
		sc.close();
	}
}
