package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
	private String name;
	private int age;
	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	 @Override
	public String toString() {
	    return String.format("(%s, %d)", name, age);
	    }
}


public class Quiz1 {
	public static void main(String[] args) {
		// 1. Person 클래스를 작성
		// - 필드는 이름, 나이만
		// 2. 1번의 클래스 객체를 3개정도 생성
		// 3. 2번의 객체를 List에 순서대로 추가
		// 4. iterator를 사용해서 반복으로 모두 출력
		// 5. 이름순으로 오름차순 정렬
		// 6. 나이순으로 내림차순 정렬
		
		Person[] per = new Person[] {
				new Person("홍길동", 33), 
				new Person("김민지", 25),
				};
		
		List<Person> list = new ArrayList<Person>(Arrays.asList(per));
		list.add(new Person("김철수", 14));
		list.add(new Person("박민정", 34));
		
		System.out.println("4. iterator 출력");
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		} System.out.println();
		
		System.out.println("5. 이름순 오름차순 출력");
		list.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
		for (Person each : list) {
            System.out.println(each);
        } System.out.println();
		
		System.out.println("6. 나이순 내림차순 출력");
		list.sort((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()));
		for (Person each : list) {
		    System.out.println(each);
		} System.out.println();
		
		
	}
}
