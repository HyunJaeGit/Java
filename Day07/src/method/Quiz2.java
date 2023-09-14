package method;

/* 
	피보나치 수열
	- 앞의 두 수를 더해서 현재 수를 구현하는 수열
	- 즉, f(n) = f(n-1) + f(n-2)		- 점화식(수학)
	- 단, f(1) = f(2) = 1
	
	ex)
	1 1 2 3 5 8 13 21 34 55 89 ...
	
*/

// 하노이 타워


public class Quiz2 {
	
	static int Fibo(int n) {
		if (n<=2) { return 1; }

		return Fibo(n-2) + Fibo(n-1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Fibo(3) = " + Fibo(3));		// 2
		System.out.println("Fibo(9) = " + Fibo(9));		// 34
//		System.out.println("Fibo(50) = " + Fibo(50));	-> 하자가 있어서 오래걸림
	}
	
	
}
