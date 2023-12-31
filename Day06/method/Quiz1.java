package method;

public class Quiz1 {
	
	static void printNumber(int n) {
		for (int i = 1; i<=n; i++) {
			System.out.printf("%d ", i);
		}System.out.println();
	}
	
	static void printDivisor(int n) {
		for (int i = 1; i<=n; i++) {
			if (n % i==0) { System.out.printf("%d ", i); }
		}System.out.println();
	}
	
	static void printNum(int n, int m) {
		for (int i = 1; i<=m; i++) {
			if (i<n) { continue; }
			System.out.printf("%d ", i);
		}System.out.println();
	}
	
	static void printArr(int arr[]) {
		for (int i = 0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		// 아래 코드들이 실행되게 메서드를 구현
		// 1. 1 ~ n 까지 일렬로 출력하는 메서드
		System.out.println("\n 문제1)");
		printNumber(5);		// 1 2 3 4 5
		printNumber(3);		// 1 2 3
		
		
		// 2. 전달한 정수의 약수를 출력
		System.out.println("\n 문제2)");
		printDivisor(6);	// 1 2 3 6
		printDivisor(4);	// 1 2 4
		
		
		// 3. n ~ m 사이의 수를 출력
		System.out.println("\n 문제3)");
		printNum(5, 10);	// 5 6 7 8 9 10
		printNum(7, 10);	// 7 8 9 10
		
		// 4. 전달한 배열을 일렬로 출력
		System.out.println("\n 문제4)");
		int[] arr1 = new int[] { 10, 20, 30 };
		int[] arr2 = new int[] { 3, 5, 7, 9 };
		
		printArr(arr1);		// 10 20 30
		printArr(arr2);		// 3 5 7 9
		
	}
}
