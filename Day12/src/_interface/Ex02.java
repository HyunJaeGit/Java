package _interface;

import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " (" + age + "세)";
	}

	@Override
	public int compareTo(Person o) {
		// this : 앞, o : 뒤
		
		return age - o.age;		// this.age - o.age
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person[] pers = new Person[] {
			new Person("홍길동", 30),
			new Person("김민지", 26),
			new Person("박철민", 18)
		};
		
		System.out.println("pers = " + Arrays.toString(pers));
		
		Arrays.sort(pers);
		System.out.println("pers = " + Arrays.toString(pers));
		
		
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {
			return o2.getAge() - o1.getAge();
		};
		
		Arrays.sort(pers, ageDesc);
		System.out.println("pers = " + Arrays.toString(pers));
		
	}
}
