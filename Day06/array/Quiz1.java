package array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		1. 학생 5명의 점수를 저장할 수 있는 배열을 생성
		2. 해당 배열에 점수를 입력
		3. 입력 받은 배열의 내용을 일렬로 출력
		4. 학생들 점수의 합계와 평균을 출력
		5. 가장 높은 점수와 가장 낮은 점수를 출력
		6. 낮은 순에서 높은 순의 점수로 정렬 (= 오름차순 정렬) */
		
		// 1,2)
		int n = 5;
		int i;
		int[] arr = new int[n];
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < n; i++) {
			System.out.print(i + 1 + "번째 학생 : ");
			arr[i] = sc.nextInt();
		
		}
		System.out.println("\n점수 목록 : " + Arrays.toString(arr));
		
		// 3)
		
		System.out.println("점수 결과)");
		
		for (i = 0; i<arr.length; i++) {
		System.out.printf("%d) %d점\n", i+1, arr[i]);
		} System.out.println();
		
		// 4)
		int sum=0;
		double avg=0;
		for (i=0; i<arr.length; i++) {
			sum += arr[i];
			avg = (double)sum/n;	
		} System.out.printf("\n총점(평균) : %d점(%.2f점)", sum, avg);
		System.out.println();
		
		// 5)
		int max = arr[0];
		int min = arr[0];
		
		for (i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("가장 높은 점수 = " + max);
		System.out.println("가장 낮은 점수 = " + min);
		
		
		// 6.
		for (i=0; i<arr.length; i++) {				// 선택 정렬 (시간복잡도 Bad)
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("\n 정렬후 : " + Arrays.toString(arr));
		
		
		sc.close();
	}
}
