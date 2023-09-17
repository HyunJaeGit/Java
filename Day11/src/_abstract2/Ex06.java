package _abstract2;

import java.util.Arrays;
import java.util.Comparator;

class Desc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;	// 앞에서 뒤로 빼면 오름차순, 뒤에서 앞을 빼면 내림차순
	}
	
}




public class Ex06 {
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] { 50,60,70,40,30,20 };
		System.out.println("arr = " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("arr = " + Arrays.toString(arr));
		
		Desc desc = new Desc();
		
//		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
//			return o2 - o1;
//		};								※ 람다식으로 바로 구현도 가능(객체없이)
		
		
		Arrays.sort(arr, desc);
		System.out.println("arr = " + Arrays.toString(arr));
		
		// 순서!!!
		// 1. 개발자가 sort()	메서드를 실행해서 정렬을 요구한다
		// 2. sort()는 개발자가 어떤 기준으로 비교하는지 알 수 없어 역으로 비교기준(Comparator)를 요구
		//	- 이를 콜백(call back)이라고 한다
		// 3. 따라서 개발자는 비교기준을 구현(implements)해서 전달 하면 sort()가 비로소 정렬을 수행해 준다
		
		
		
	}
}
