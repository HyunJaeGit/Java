package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Person2 implements Comparable<Person2>{
	private String name;
	private int age;
	
	Person2(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s (%d세) ",name, age);
	}

	@Override
	public int compareTo(Person2 o) {
		return name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	
	
	
}


public class Quiz1_Answer {
	public static void main(String[] args) {
		
		Person2 p1 = new Person2("홍길동", 22);
		Person2 p2 = new Person2("김민수", 33);
		Person2 p3 = new Person2("이수진", 44);
		
		ArrayList<Person2> list = new ArrayList<Person2>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(new Person2("박진혁",29));
		
		System.out.println("list = " + list);
		
		// 4) 
		Iterator<Person2> it = list.iterator();
		while (it.hasNext()) {
			Person2 per = it.next();
			System.out.println("per = " + per);
		} System.out.println();
		
		// 5)
		list.sort(null);
		System.out.println("list = " + list);
		
		// 6)
		Comparator<Person2> ageDesc = (Person2 o1, Person2 o2) -> {
			return o2.getAge() - o1.getAge();
		};
		list.sort(ageDesc);
		System.out.println("list = " + list);
		
		
	}
}
