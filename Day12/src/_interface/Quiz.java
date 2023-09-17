package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Quiz {
	public static void main(String[] args) {
		Person[] pers = new Person[] {
			new Person("홍길동", 30),
			new Person("김민지", 26),
			new Person("박철민", 18)
		};
		
		// 위의 배열을 이름 순으로 오름차순과 내림차순으로 둘 다 출력
		// ※ 필요하면 access 메서드를 작성한다
		Comparator<Person> nameAsc = (Person o1, Person o2) -> {
			String s1 = o1.getName();
			String s2 = o2.getName();
			
			return s1.compareTo(s2);
		};
		
		Arrays.sort(pers, nameAsc);
		System.out.println("pers = " + Arrays.toString(pers));
		
		
		Arrays.sort(pers, (Person o1, Person o2) -> -o1.getName().compareTo(o2.getName()));
		System.out.println("pers = " + Arrays.toString(pers));
		
	}
}
