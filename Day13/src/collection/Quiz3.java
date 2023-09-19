package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Quiz3 {
	public static void main(String[] args) {
		// 로또 추첨기를 구현
		// 1. 숫자를 1 ~ 45 사이의 숫자를 무작위로 뽑음
		// 2. 단, 중복없이 6개를 뽑아야 함
		// 3. 결과 발표는 낮은 숫자부터 발표
		
		System.out.println("로또 번호 자동 추첨기");
		
		Random ran = new Random();
		
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() < 6) {
			int n = ran.nextInt(45) + 1;
			set.add(n);
		}
		System.out.println("set = " + set);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(set);
		list.sort(null);
		System.out.println("\nlist = " + list);
	}
}
