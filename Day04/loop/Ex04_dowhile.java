package loop;

import java.util.Scanner;

// while : (조건식) -> (종속문)
// do	 : (종속문) -> (조건문)
//
// 즉, do ~ while문은 종속문이 무조건 1번은 실행된다

public class Ex04_dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("정수 입력(0: 종료)>> ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
			
		} while (n != 0);
		
		System.out.println("프로그램 종료~");
		sc.close();
		
	}
}
