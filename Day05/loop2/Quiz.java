package loop2;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 별찍기
		
		// 1번) N x N찍기
		// 입력 : 5
		
		Scanner sc = new Scanner(System.in);
		int N,i,j;
		System.out.println("정수 입력 : ");
		N = sc.nextInt();
		
		for (j=0; j<N; j++) {
			for (i=0; i<N; i++) {
				System.out.print("☆");	
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 2번) 직각 삼각형
		// 입력 : 5
		
		for (j=0; j<N; j++) {
			for (i=0; i<=j; i++) {
				System.out.print("☆");
				
			}
			System.out.println();
		} 
		System.out.println();
		
		
		// 3번) 2번을 위아래 반전
		// 입력 : 5
		
		for (j=N; j>0; j--) {
			for (i=0; i<j; i++) {
				System.out.print("☆");
				
			}
			System.out.println();
		} 
		System.out.println();
		
		
		
		// 4번) 2번을 좌우 반전
		// 입력 : 5
		
		
		for (j=N; j>0; j--) {
			
			for (i=0; i<j-1; i++) {
				System.out.print(" ");
				
			}
			for (i=0; i<=N-j; i++) {
				System.out.print("*");
				
			}
			System.out.println();
		} 
		System.out.println();
		
		// 5번) 4번을 위아래 반전
		// 입력 : 5
		
		for (i=0; i> N; i++) {
			
			for (j=0; j < i; j++) {
				System.out.print(" ");
				
			}
			for (j=0; j<=N - j; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		} 
		System.out.println();
	
		// 6번) 피라미드
		// 입력 : 5
		
		for (i=0; i<N; i++) {
			for (j=N-(i+1); j>0; j--) {
				System.out.print("   ");
			}
			for (j=1; j<=i*2+1; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 7번) 6번 위아래 반전
		// 입력 : 5
		for (i = N - 1; i >= 0; i--) {
		    for (j = N - (i + 1); j > 0; j--) {
		        System.out.print("   ");
		    }
		    for (j = 1; j <= i * 2 + 1; j++) {
		        System.out.print("☆");
		    }
		    System.out.println();
		}
	
	
	
	
	
	
	}
	
	
}
