package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private int age;
	private String name;
	
	Person( String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return String.format("%s (%d 세)",getName(), getAge());
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
	
	
}



public class Quiz1 {
	public static void main(String[] args) {
		// 1. Person 클래스를 작성
		// - 필드는 이름, 나이만
		Person[] per = new Person[] {
				new Person("홍길동", 24),
				new Person("김민지", 22)				
					
		};
		
		
		// 2. TreeSet에 Person 3개정도 지정 후 출력
		// - 이름순으로 오름차순 되게
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("박진수", 15));
		ts.add(new Person("나기욱", 44));
		ts.add(new Person("김지수", 33));
		System.out.println("ts = " + ts);
		
		
		// 3. Comparator를 사용해서 나이 순으로 내림차순 후 출력
		
		Comparator<Person> ageDesc;
		
		ageDesc = (Person o1, Person o2) -> {
			return o2.getAge()	- o1.getAge();
		};
		
		TreeSet<Person> ts2 = new TreeSet<Person>(ageDesc);
		ts2.addAll(ts);
		System.out.println("ts2 = " + ts2);
		
		
	}
}
