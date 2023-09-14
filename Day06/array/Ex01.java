package array;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 1차원 배열 : 특정 자료형을 일렬로 저장
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		// 2차원 배열 : 1차원 배열을 요소로 저장
		int[][] arr2 = new int[][] {
			{ 10,20,30,40 },	// 0행
			{ 11,21,31,41 },	// 1행
			{ 12,22,32,42 }		// 2행
		//	  0열 1열 2열 3열
		};
		//				행	:	{  0  }		      {  1  }	  		{  2  }
		arr2 = new int[][] { { 10,20,30,40 }, { 11,21,31,41 }, { 12,22,32,42 } };
		//				열    : {  0  1  2  3 }  {  0  1  2  3 }  {  0  1  2  3 }
		
		
		System.out.println("arr2 = " + arr2);
		System.out.println("arr2[0] = " + Arrays.toString(arr1));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");
		
		System.out.println("41 = " + arr2[1][3]);
		System.out.println("22 = " + arr2[2][1]);
	
	}
}
