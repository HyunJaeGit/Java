package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
	public static void main(String[] args) {
		// 아래 배열을 정렬하여 출력
		Double[] arr = new Double[] { 6.123, 3.141592, 5.34 };
		
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		Comparator<Double> desc = (Double o1, Double o2) -> {
				return o2.compareTo(o1);
		};
		
		// 함수형 인터페이스를 구현한 람다식을 작성 후 전달하거나
		Arrays.sort(arr, desc);
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		// 바로 람다식을 작성해서 전달도 가능
		Arrays.sort(arr, (Double o1, Double o2) -> o2.compareTo(o1));
		System.out.println("arr = " + Arrays.toString(arr));
		
		
	}
}
