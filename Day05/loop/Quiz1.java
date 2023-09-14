package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 문제들은 for문으로 해결한다
		// 1. 정수를 입력 받아서 1 ~ n 까지 일렬로 출력
		// ex) 입력 : 6 -> 출력 : 1 2 3 4 5 6
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		System.out.println("\n 문제 1.");
		System.out.printf("입력 : %d -> 출력 : ", n);
		for (i = 1; i <= n; i++) {
			System.out.printf("%d ",i);
		} System.out.println();
		
		// 2. 정수를 입력받아서 약수를 출력
		// ex) 입력 : 6 -> 출력 : 1 2 3 6
		System.out.printf("입력 : %d -> 출력 : ", n);
		for (i = 1; i <= n; i++) {
			if (n % i == 0) System.out.printf("%d ",i);
		} System.out.println();
		
		
		
		// 3. 정수를 입력 받아서 소수인지 판별
		// ex) 입력 : 6 -> 출력 : 소수 아님
		System.out.printf("입력 : %d -> 출력 : ", n);
		for (i = 2; i < n; i++) {
			 
			if (n % i == 0) {
				System.out.print("소수 아님");
				break;
				}
			else  {
				System.out.print("소수");
				break;
			}
			
		}System.out.println(); sc.close();
	}
	
}
