package method;

// 하노이 팁)
// ※ PDF 참고

public class Ex04 {
	
	// (원반 개수, 출발지, 보조, 목적지)
	static void hanoiMove(int n, char src, char sub, char dst) {
		
		if (n == 1) {
		System.out.printf("원판 %d : %c -> %c\n", n, src, dst);
		return;
		}
		hanoiMove(n - 1, src, dst, sub);
		System.out.printf("원판 %d : %c -> %c\n", n, src, dst);
		
		hanoiMove(n - 1, src, sub, dst);
	}
	
	public static void main(String[] args) {
		
		hanoiMove(1, 'A', 'B', 'C');
		// 원판 1개를 A에서 C로 모두 옮겨라~
		
		hanoiMove(2, 'A', 'B', 'C');
		// 원판 2개를 A에서 C로 모두 옮겨라~
		
		hanoiMove(3, 'A', 'B', 'C');
		// 원판 3개를 A에서 C로 모두 옮겨라~
	}
	
}
