package loop2;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1. 구구단 2단을 단일 반복으로 출력. 단, x1 ~ x9까지만
		
		int dan,i;
		dan=2;
		
		for (i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan*i));	
		}
		System.out.println("-------------------");
		
		
		// 2. 1번을 중첩 반복으로 만들어서 2단을 8번 출력
		for (dan=1; dan<=8; dan++) {
			for (i=1; i<=9; i++) {
				System.out.printf("2x%d= %d  ", i, (2*i));
			}System.out.println();
		}
		System.out.println("-------------------");
		
		// 3. 2번을 조금 수정해서 구구단 2단 ~ 9단까지 출력
		
		for (dan=2; dan<=9; dan++) {
			System.out.printf("=== %d단 ===\n", dan);
			for (i=1; i<=9; i++) {
				System.out.printf("%dx%d= %d\n", dan, i, (dan*i));
			}System.out.println();
		}
	}
}
