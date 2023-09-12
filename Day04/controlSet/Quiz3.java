package controlSet;

import java.util.Scanner;

/*
	3. 버스는 10 정거장 미만일 경우 각 역 평균 이동 시간이 2 분
	소요되며, 10 정거장이 넘으면 4분의 소요시간이 걸린다. 
	정거장 수를 입력하면 소요시간을 계산하여 출력하시오
	(간단하게 10 이상이면 전역 * 4, 10미만이면 전역 * 2)
	
	출력>
	정거장 수 : 8
	총 소요 시간은 16분 입니다.
	정거장 수 : 16
	총 소요 시간은 1시간 4분 입니다
 */

public class Quiz3 {
	public static void main(String[] args) {
		// 풀이
		
		Scanner sc = new Scanner(System.in);
		int station, total;
		
		System.out.print("정거장 수? ");
		station = sc.nextInt();
		
		// 1. 일단 2분으로 계산
		total = station * 2;
		
		// 2. 10정거장 이상이다 -> x4
		total *= (station >= 10) ? 2 : 1;
		
		// 3. 시간 : 분 나누어 출력
		if (total >= 60) {
			int h = total / 60;
			int m = total % 60;
			
			System.out.printf("총 소요 시간 %d 시간 %d 분 입니다~\n", h, m);
			
		}
		
		else {
			System.out.println("총 소요 시간 : " + total + "분");
		}
		
		System.out.println("정거장 수 : " + station);

		sc.close();
		
		/* int n = 0;			// 정거장 개수
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정거장 수를 입력해주세요 : ");
		n = sc.nextInt();
		sc.nextLine();
		
		int t = 4;			// 역 평균 이동 시간
		int costm=0;		// 전체 소요시간 (분)
		int costh=0;		// 전체 소요시간 (시간)
		costm = n*t;
		costh = (int)costm/60;
		int costm2 = costm-60*costh;	// (costh) 시간 (costm2) 분
		
		System.out.println("출력> ");
		System.out.printf("정거장 수 : %d\n", n);
		
		
		if (n>=15)
		System.out.printf("총 소요시간은 %d시간 %d분 입니다.\n", costh, costm2);
		
		if (n<15&&n>=10)
		System.out.printf("총 소요시간은 %d분 입니다.\n", costm);
		
		if (n<10) {
		costm = n*(t-2);
		System.out.printf("총 소요시간은 %d분 입니다.\n", costm);
		}
		
		sc.close();
		*/
	}
}
