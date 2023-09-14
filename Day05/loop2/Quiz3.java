package loop2;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("몇 줄? >>");
		n = sc.nextInt();
		
		// 1. ㅁ 찍기
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n -1) || j == 0 || j == (n-1)) {
					System.out.print("*");
					
				}
				else System.out.print(" ");
			}	
			System.out.println();
		}
			System.out.println();
			
			
			// 2. + 찍기
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == (n / 2) || j == (n / 2)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
		
			// 3. x 찍기
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j || i + j == (n - 1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			// 4. z 찍기
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (i == 0 || i == 4 || i + j == 4) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			sc.close();
			
			
	}
}
