package operator;



public class Ex03 {
	public static void main(String[] args) {
		// 대입 연산자 : 값을 할당하는 연산
		// 1. 좌변은 공간, 우변은 결과값
		// 2. 항상 우변부터 실행
		// 3. 대입 연산의 양변의 자료형은 항상 일치 시킨다
		
		int n = 10 + 3;
//		int n = 13
		
		System.out.println("n = " + n);
		
		int a, b, c;
		
		a = b = c = 10;
		
//		int a,b,c = 10; -> c = 10 만 적용됨
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
}
