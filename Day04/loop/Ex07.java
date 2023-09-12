package loop;

public class Ex07 {
	public static void main(String[] args) {
		// 지역변수 : 특정 영역 안에 포함된 변수를 의미
		// - 해당 영역에서 생성되고 그 영억이 끝나면 메모리에서 제거
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World!!!");
			
		}
		// System.out.println("반복 후 i = " + i);
		// - i 는 for문에서 생성된 지역 변수
		// - 따라서, for문이 끝나면 메모리에서 제거
	}
}
