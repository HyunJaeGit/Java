package api;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		System.out.println("50의 위치 : " + Arrays.binarySearch(arr1, 50));
		// - binarySearch() : 이진 탐색
		// - ※ 이진 탐색은 정렬이 되어있어야 한다
		
		int[][] arr2 = new int[][] {
				{10,20,30,40,50},
				{11,21,31,41,51},
				{12,22,32,42,52}
		};
		
		System.out.println("arr2 = " + Arrays.deepToString(arr2));
		// - 다차 배열은 deepToString()을 사용해서 문자열로 받을 수 있다
	}
}
