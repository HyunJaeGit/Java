package api;

import java.util.Random;
import java.util.Scanner;

public class Quiz_answer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int answer, n=0, count=0;
		long start, end;
		String msg;
		
		answer = ran.nextInt(100) + 1;

//		 디버깅
//		System.out.println("답 : " + answer);
		
		start = System.currentTimeMillis();
		
		while (answer != n) {
			count++;
			
			System.out.println("정답 입력 : ");
			n = sc.nextInt();
			
			if (answer == n) 			msg = "\n정답입니다";
			else if (answer > n) 		msg = ">> UP";
			else 			 			msg = ">> Down";
			
			System.out.println(msg);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("횟수		: " + count);
		System.out.println("소요 시간	: " + (end-start)/1000.0);
		sc.close();
		
		
		
		
		
		
	}
}
