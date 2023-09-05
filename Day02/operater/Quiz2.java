package operator;


public class Quiz2 {
	public static void main(String[] args) {
		// 1. 절대값을 출력
		int n = 10;
		int result = (n<0) ? -n : n;
		System.out.println("절대값 n : " + result);
		System.out.println();
			
		
		// 2. 두 수중 큰 수를 출력
		int n1, n2;
		n1 = 10;
		n2 = 20;
		int result2 = (n1>n2) ? n1 : n2;
		System.out.println("큰 수 : " + result2);
		System.out.println();
		
		// 3. 짝수인지 판별
		n = 2;
		String result3 = (n%2)==0 ? "짝" : "홀";
		System.out.println(result3);
		System.out.println();
		
		// 4. 3과 5의 공배수인지 판별
		n = 15;
		boolean result4 = n % 3 == 0 && n % 5 == 0;
		String mul = result4? "true" : "false";
		System.out.println(mul);
		System.out.println();
		
	}
	
	/* 1번 문제		
	int result;
	if (n<0) {
		result = n * -1;
		System.out.println(result);
	}
	else {
		result = n;
		System.out.println(result);
	} 
	*/		
}
