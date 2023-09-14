package method;

public class Ex04 {
	
	static void func(int n, int[] arr) {		// 일반타입 : 우연히 이름이 같을뿐 main함수의 int n 과는 별개
		n++;									// int m으로 해도 상관없음
		arr[0]++;								// 참조 타입 : 가리키는 데이터가 같아서 
												// { 10 } + 1 해주고 지역변수라서 사라짐
	}
	
	
	public static void main(String[] args) {
		// 일반 타입은 복사시 실제 데이터가 복사됨
		// 참조 타입은 복사시 가리키는 방향이 같아짐
		
		int n = 10;	 
		int[] arr = new int [] { 10 };
		
		func(n,arr);
		System.out.println("n = " + n);
		
		System.out.println("arr[0] = " + arr[0]);
		
	}
}
