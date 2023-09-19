package exception;

import java.util.Scanner;

// 2. throws 사용시
// - main 한 곳에서 try ~ catch 예외를 모두 처리
// - 구문의 개수가 줄어들어 가독성 확보에 도움됨
// - 발생하는 예외가 많을수록 효과적임

public class Ex05 {
	
	static void countDown(int sec) throws InterruptedException {
		for (int i = sec; i >=1; i--) {
			System.out.println(i + "초");
			Thread.sleep(1000);
		} System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec;
		
		try {
		System.out.println("몇 초??? ");
		sec = sc.nextInt();
		
		countDown(sec);
		} catch(Exception e) {
			System.err.println("예외 : " + e.getMessage());
		}
		sc.close();
		
	}
}
