package method;

// 메서드 오버로딩 (= method overloading)
// - 같은 이름이 메서드를 여러개 작성하는 방식
// - 단, 매개변수의 형태가 달라야 한다


public class Ex01 {
	
	static int adder(int n1, int n2) {
		return n1 + n2;
	}

	static int adder(int n) {		
		return n + 100;	
	}
		// - 반환형이 달라서 X, 매개변수(int n <-> double n)가 달라서 가능한것임
	static double adder(double n) {
		return n + 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("adder(5,3) = " + adder(5,3));
		System.out.println("adder(5) = " + adder(5));
		System.out.println("adder(5.0) = " + adder(5.0));

		Math.abs(5);
		Math.abs(5.0);
	}
}
