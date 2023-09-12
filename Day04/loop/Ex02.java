package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 연습
		// 1. 아래 구문을 반복으로 줄여보세요
		System.out.println("2단 거꾸로 >> ");
		int i=9;
		while (i>0) {
			System.out.printf("%d x %d = %d\n", 2, i, 2*i);
			i-=1;
		}
		System.out.println();
		
		
		// 2. 1번을 입력문으로 전환 후 입력한 구구단을 출력
		i = 1;
		int dan;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 몇 단? ");
		dan = sc.nextInt();
		
		while (i<10) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			i+=1;
		}
		System.out.println();
		
		// 3. 역순으로도 출력
		i = 9;
		while (i>0) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			i-=1;
		}
		System.out.println();
		sc.close();
	}
}
