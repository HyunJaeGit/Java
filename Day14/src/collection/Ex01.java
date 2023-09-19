package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex01 {
	public static void main(String[] args) {
		// TreeSet
		// - Tree라는 자료구조 기반으로 만들어진 Set
		// - 출력시 오름차순으로 출력됨
		Random ran = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i =1; i <=10; i++) {
			int n = ran.nextInt(100) + 1;
			hs.add(n);
		}
		System.out.println("1>> hs = " + hs);
		
		// TreeSet은 기본 Comparable을 가지고 정렬
		TreeSet<Integer> ts = new TreeSet<Integer>(hs);
		System.out.println("2>> ts = " + ts);		// - 오름차순 정렬됨
		
		// 다른 비교 기준을 사용하려면 생성자에 Comparartor를 구현해서 넘김
		Comparator<Integer> desc;
			
			desc = (Integer o1, Integer o2) -> {
				return o2 - o1;
			};
		
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(desc);
		ts2.addAll(ts);							// - comparator 람다식으로 내림차순 구현
		
		System.out.println("3>> ts2 = " + ts2);
	
		
		
		
	}
}
