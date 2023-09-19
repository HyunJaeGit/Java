package collection;

import java.util.Comparator;
import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		// ArrayList vs LinkedList
		// 1. ArrayList		: 속도 빠름, 변화에 취약
		// 2. LinkedList	: ArrayList보단 느림, 변화에 상관없음
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("C/C++");
		list.add("Python");
		list.add("Go");
		list.add("Java");
		
		System.out.println("1) list = " + list);
		
		
		list.sort(null);
		System.out.println("2) list = " + list);
		
		list.sort((String o1, String o2) -> o2.compareTo(o1));
		System.out.println("3) list = " + list);
	}
}
