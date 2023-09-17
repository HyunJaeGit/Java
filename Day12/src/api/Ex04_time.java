package api;

import java.util.Scanner;

public class Ex04_time {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 현재시간 = 1970 + System.currentTimeMillis()
		// Unix 타임 : 1970년 부터 1초씩 세고 있는 시간
		long time = System.currentTimeMillis();
		
		System.out.println("현재 시간 : " + time);									// 밀리초E9 = (10의 승수) -> E9 = 10의 9제곱
		System.out.println("현재 시간 : " + time / 1000.0);							// 초 =  (밀리세컨드 x 1000)
		System.out.println("현재 시간 : " + time / 1000 / 60);						// 분
		System.out.println("현재 시간 : " + time / 1000.0 / 60 / 60);				// 시간
		System.out.println("현재 시간 : " + time / 1000.0 / 60 / 60 / 24);			// 일
		System.out.println("현재 시간 : " + time / 1000.0 / 60 / 60 / 24 / 365);	// 년
	
		
		// ※ 시작 시간과 종료 시간의 차이는 소요 시간
		// 즉, 소요 = 종료 - 시작
		Scanner sc = new Scanner(System.in);
		String word;
		
		long start = System.currentTimeMillis();
		
		System.out.println("Hello World!!! Welcome to Java~");
		System.out.println("< Press any Key >");
		word = sc.nextLine();
		
		long end = System.currentTimeMillis();
		System.out.printf("총 소요 시간 : %.2f초\n", (end - start) / 1000.0);
		
		sc.close();
		
	}
}
