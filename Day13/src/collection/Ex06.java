package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		// Set : 순서x, 중복x
		// 인터페이스 = 구현한 클래스는 HashSet, TreeSet 등이 있다
		// - 주로 중복된 값을 걸러낼때 사용한다 
		// - (List -> Set (중복 걸러짐) -> List
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);		// 중복된 데이터 (무시된다)

		for (Integer n : set) {
			System.out.println("set = " + n);
		}
//		System.out.println("set[0] = " + set.get(0));
//		-> index가 없음 = 인덱싱 불가
		
		set.remove(20);
		System.out.println("set = " + set);			// 인덱싱 없어서 직접 제거
		
		System.out.println("set = " + set.size());	// 사이즈(길이)
		
		Integer[] arr = new Integer[]	{ 50,60,70,80,90 };
		
		set.addAll(Arrays.asList(arr));
		for (int n : set) {
			System.out.println("n = " + n);
		} System.out.println();
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println("값 : " + it.next());
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
		}
	
	}
}
