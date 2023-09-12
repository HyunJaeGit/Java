package _switch;

import java.util.Scanner;

// 조건문 PDF 9p를 switch로 풀어보세요


public class Quiz {
	public static void main(String[] args) {
		
		// 1) 점수 입력 받기
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("세 과목 점수 입력 (국, 영, 수) >> ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sc.nextLine();
		
		// 2) 평균구하기
		int sum = kor+eng+mat;
		double avg = sum/3;
		int gradeCode = (int) avg / 10;

        // 3) 점수별로 구분하여 등급 매기기
        String grade;
        switch (gradeCode) {
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        // 4) 등급 출력
        System.out.println("등급 >> " + grade);
        sc.close();
	}
}
