package wrap;

public class Ex02 {
	public static void main(String[] args) {
		// 문자열과 형변환
		// 1. 문자열 -> 정수
		System.out.println("1) 문자열 -> 정수");
		String str1 = "123";
		String str2 = "3.141592";
		
		System.out.println(str1 + str2);
		
//		int n1 = (int) str1;		일반 타입과 클래스 간에는 형변환 불가능(강제형변환 불가) 
		int n1 = Integer.parseInt(str1);
		double n2 = Double.parseDouble(str2);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1 + n2);
		System.out.println();
		
		// 2. 정수, 실수 -> 문자열
		System.out.println("2) 정수,실수 -> 문자열");
		str1 = Integer.toString(10);		// 정수 -> 문자열
		str2 = Double.toString(6.1234);		// 실수 -> 문자열
		
		System.out.println(str1 + str2);	// 문자열 + 문자열 = 문자열
		System.out.println();
		
		// ※ 자동 형변환의 활용
		System.out.println("3) 자동 형변환 >>");
		str1 = 15 + "";
		str2 = 13.14 + "";
	
		System.out.println(str1 + str2);
		
		str1 = "" + 10 + 20;
		str2 = 10 + 20 + "";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
