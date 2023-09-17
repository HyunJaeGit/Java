package api;

import java.util.Random;
import java.util.Scanner;

/*
Up/Down 게임 구현
1. 정답이 될 숫자를 랜덤으로 뽑아둔다
2. 사용자에게 값을 입력 받아서 정답과 맞는지 검사
- 맞으면 정답 후 입력 횟수를 출력 후 종료
- 정답보다 작으면 UP을 출력 후 다시 입력 받음
- 정답보다 크면 Down을 출력 후 다시 입력 받음
*/

public class Quiz {
	public static void main(String[] args) {

		Random ran = new Random();
		int answer = ran.nextInt(101);
		System.out.println(answer);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Up/down 게임을 시작합니다\n---------------");
		
		int n;
		int count=0;
		while (true) {
		    System.out.print("\n100이하의 정수 입력 : ");
		    n = sc.nextInt();
		    count++;
		    
		    if (answer == n) {
		        System.out.println((count+1) + "회 >> 정답입니다!!!");
		        break; 
		    } 
		    
		    else if (answer > n) {
		        sc.nextLine();
		        System.out.println(">> UP!!");     
		    } 
		    
		    else {
		        sc.nextLine();
		        System.out.println(">> Down!!");
		    }
		}
		sc.close();
	}
}

