package array;

public class Ex02 {

	public static void main(String[] args) {
		// 배열 생성 방법
		// 1. 초기화 한다 
		int arr1[]= new int[] { 10, 20, 30, 40, 50 };
		
		
		// 2. 빈 공간을 생성한다
		int arr2[] = new int[3];
		
		
		// 3. 상수로 생성한다 (사용하지 않는 것을 권장) -> C언어에서 유래
		int arr3[] = { 11, 22, 33, 44 };
		
		
		// - (초기화 하지않으면 '쓰레기 값'이 채워져 있어서 연산하면 안된다)
		// - 초기화 할때는 공간을 생성하지 않는다
		// - 공간을 생성할때는 배열 값을 채우지 않는다
		
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr3[0] = " + arr3[0] + "\n");
		
		
		arr1[0] = 100;
		arr3[0] = 111;
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr3[0] = " + arr3[0]);
		
	}
}
