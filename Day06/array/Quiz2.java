package array;

// 배열 PDF 9, 10p

public class Quiz2 {
	public static void main(String[] args) {
		// 1. 8 x 8 이차원 배열에 1 ~ 64까지 채우고 for-each 문으로 출력
		int n = 8;
		int[][] arr = new int[n][n];
		int i,j;
		int count = 1;
		
		for (i=0; i< n; i++) {
			for (j=0; j< n; j++)  {
				arr[i][j]= count++;	
				System.out.printf("%2d ", arr[i][j]);
			} System.out.println();
		}System.out.println(); 
		
		// i열 과 j행을 바꿔서 1~64 채우기
		
		for (i=0; i< n; i++) {
			for (j=0; j< n; j++)  {	
				System.out.printf("%2d ", arr[j][i]);
			} System.out.println();
		}
		
	}
}
