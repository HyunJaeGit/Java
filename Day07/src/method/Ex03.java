package method;

import java.util.concurrent.CountDownLatch;

public class Ex03 {
	
	static int total(int n) {
		if (n == 1) { return 1; }
		
		return n + total(n - 1);
//		return 3 + total(2)
//					return 2 + total(1)
//									1
	}
	
	static int fac(int n) {
		if (n==1) {return 1;}
		
		return n * fac(n - 1);
		
	}
		
	static int pow(int n, int e) {
		if (e == 0) {
			return 1;
		}
		
		return n * pow(n, e - 1);
	}
	
	public static void main(String[] args) {
		
		System.out.println("total(3) = " + total(3));
		System.out.println("total(10) = " + total(10));
		
		
		// 연습1)
		System.out.println("fac(5) = " + fac(5));
		
		// 연습2)
		System.out.println("pow(2, 10) = " + pow(2,10));
		
		
	}
	
	
	
}
