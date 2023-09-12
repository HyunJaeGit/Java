package controlSet;

import java.util.Scanner;

// 조건문 PDF 9p

/*
1. 국영수 세과목의 성적을 입력받아 합계와 평균을 구하고
등급 컷을 출력하세요
90이상 A등급
80이상 B등급
70이상 C등급
60이상 D등급
그 아래 F등급
 */

public class Quiz1 {

	public static void main(String[] args) {
		int kor, eng, mat;
		
		// 1) 세 과목 점수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("국 영 수 점수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sc.nextLine();
		
		System.out.println("----------------");
		
		// 2) 합계와 평균 구하기
		int sum = kor + eng + mat;
		double avg = (double)sum/3;
		System.out.println("결과) ");
		System.out.printf("합계(평균) : %d (%.1f)", sum, avg);
		System.out.println();
		
		// 3) 등급 컷 출력
		System.out.print(">> ");
		if (avg >=90) System.out.println("등급 : A ");
		else if (avg >= 80) System.out.println("등급 : B ");
		else if (avg >= 70) System.out.println("등급 : C ");
		else if (avg >= 60) System.out.println("등급 : D ");
		else if (avg >= 50) System.out.println("등급 : E ");
		else System.out.println("등급 : F ");
		
		sc.close();
	}
}
