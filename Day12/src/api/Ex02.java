package api;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("타이머 세팅(초) : ");
		n  = sc.nextInt();
		
		for (int i=n; i >=1; i--) {
			System.out.println(i + "초");
			Thread.sleep(500);
		}
		System.out.println();
		
		sc.close();
	}
}
