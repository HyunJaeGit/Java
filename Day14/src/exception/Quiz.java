package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 정수를 입력 받아서 화면에 그대로 출력
		// - 단, 정수가 아니면 사용자에게 다시 입력 받도록함
		// - 재 입력시 정수가 맞으면 출력 후 종료
		//
		// ※ Buffer가 뭔지 생각해보세요~
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while (true) {
			try {
				System.out.println("정수 입력>> ");
				n = sc.nextInt();
		
				System.out.println("n = " + n);
				break;
				
			} catch(InputMismatchException e) {
				System.err.println("다시 입력해주세요 \n");
				sc.nextLine();
			}
			
		}
		
		sc.close();
		
		
	}
}
