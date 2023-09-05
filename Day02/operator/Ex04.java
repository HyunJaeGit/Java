package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 복합 대입 연산자 : 산술 + 대입
		
		int n = 10;
		
		n += 3;		// n = n + 3;
		System.out.println("n = " + n);
		
		n -= 5;		// n = n - 5;
		System.out.println("n = " + n);
		
		n *= 4;		// n = n * 4;
		System.out.println("n = " + n);
		
		n /= 6;		// n = n / 6;
		System.out.println("n = " + n);
		
		n %= 3;		// n = n % 3;
		System.out.println("n = " + n + "\n");
		
		int a = 5, b = 2, c = 4;
		a += b -= c /= 2;
		/*
		 	1) c = c / 2 = 4 / 2 = 2
		 	2) b = b - 2 = 2 - 2 = 0
		 	3) a = a + 0 = 5 + 0 = 5
		 	4) a = 5 / b = 0 / c = 2
		 */
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
