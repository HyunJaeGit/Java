package collection;

import java.util.ArrayList;

/*
	collection framework
	- Java에서 제공하는 자료구조들을 의미
	
	종류) ※ 아래 3타입은 모두 Interface로 작성되어 있음
	1. List	: 순서o, 중복o
	2. Set	: 순서x, 중복x
	3. Map	: key, value의 한 쌍의 구조(key는 중복 안됨,value는 중복o)
 */



public class Ex01_List {
	public static void main(String[] args) {
		// List는 인터페이스 이므로 이를 직접 구현한 하위 클래스를 사용함
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);		// add(값) : 리스트에서 가장 뒤에 데이터를 추가
		list.add(20);		// ※ 리스트는 배열처럼 크기를 지정하지 않고 동적으로 늘고 줄어듦
		list.add(30);
		list.add(10);		// 데이터의 중복 허용
		
		System.out.println("list = " + list);		// ※toString()이 오버라이드 되어있음
		
		System.out.println("list[0] = " + list.get(0));
		//	get(index)	: 지정 index 위치의 데이터를 반환
		
		list.set(1, 23);	// set(index, 값)	: 지정 위치의 값을 변경
		System.out.println("list = " + list);
		
		list.add(1, 70);	// add(index, 값)	: 지정 위치에 데이터를 추가
		System.out.println("list = " + list);
		
		int n = list.remove(2);		// remove(index)	: 지정 위치의 데이터를 제거 및 반환
		System.out.println("list = " + list);
		System.out.println("제거한 값 : " + n);
		System.out.println();
		
		// ※ 기타
		System.out.println("list의 크기 : " + list.size());		// size()		: 요소 개수 반환
		
		System.out.println("70의 위치? : " + list.indexOf(70));	// indexOf(값)	: 지정 값의 index 반환
		
		list.clear(); 											// clear() : 요소 모두 제거
		System.out.println("list = " + list);
		
		System.out.println("빈 리스트? : " + list.isEmpty());		// isEmpty()	: 빈 리스트인지 판별

		System.out.println("빈 리스트? : " + list.isEmpty());		// isEmpty()	: 빈 리스트인지 판별
		
	}
}
