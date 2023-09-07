package input;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 문자열 입력
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 : ");
		str = sc.next();
		
		System.out.println("str = " + str);
		
		// 문자열 String은 실제로는 char로 구성되어 있다.
		System.out.println("\nstr[0] = " + str.charAt(0));
		System.out.println("str[1] = " + str.charAt(1));
		
		// 위의 방식을 활용해서 단일 문자를 입력 받는다.
		char ch;
		
		System.out.print("\n문자 입력 : ");
		ch = sc.next().charAt(0);
		
		System.out.println("ch = " + ch);
		
		sc.close();
	}
}
