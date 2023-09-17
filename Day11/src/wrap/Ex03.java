package wrap;

// 제네릭은 뒤에서 배우는 파트라 일단 따라서 적어 봅시다
// <T> - T[] arr : Object 까지 받음 
// - 제네릭은 int,double 대신 실제 데이터타입인 Integer, Double 를씀

public class Ex03 {
	
	static <T> void printArr(T[] arr) {
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] { 10, 20, 30, 40 };
		Double[] arr2 = new Double[] { 10.5, 3.14 };
		String[] arr3 = new String[] { "java", "Network", "SQL" };
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
	}
}
