package operator;

public class Ex02 {
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("n + 3 = " + (n+3));
		System.out.println("n - 3 = " + (n-3));
		System.out.println("n * 3 = " + n * 3);
		System.out.println("n / 3 = " + n / 3);	// 몫
		System.out.println("n % 3 = " + n % 3);	// 나머지
		System.out.println();
		
		
		// 나눈 후 소수점(= 실수)의 결과를 얻으려면?
		// - 자동 형변환을 유도한다
		System.out.println("n / 3.0 = " + n / 3.0);
		
		int m = 3;
		
		System.out.println("n / m = " + n / m);
		System.out.println("n / m = " + n / (double)m);
		System.out.println(m);
		// - 강제 형변환은 일시적
		
	}
}
