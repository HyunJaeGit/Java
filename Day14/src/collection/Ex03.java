package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		// ※ Map의 key는 String이, Value는 Object가 가장 자주 사용된다
		// 1. key는 문자열로 접근이 가장 수월
		// 2. value는 모든 데이터를 받기 위해서
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("name", "홍길동");
		map.put("age", 25);
		map.put("address", "부산 광역시 해운대구");
		
		System.out.println("map = " + map + "\n");
		
		
		// ※ Map은 순환이 불가능한 구조
		Set<String> keys = map.keySet();
		
		for (String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		System.out.println();
		
		
		// 연습) iterator로 map을 전체 출력해본다
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String k = it.next();
			Object v = map.get(k);
			
			System.out.println(k + " : " + v);
		}
	}
}
