package loop;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수를 입력 받아서 1 ~ n 까지 일렬로 출력
		// ex) 입력 : 5 -> 출력 : 1 2 3 4 5
		int n;
		System.out.print("정수 입력>> ");
		n = sc.nextInt();
		sc.nextLine();
		
		System.out.print("1. 정방향 : ");
		int i=1;
		while (i<=n) {
			System.out.printf("%d ", i);
			i++;
		}
		System.out.println();
		
		
		
		// 2. 1번을 역순으로
		// ex) 입력 : 3 -> 출력 : 3 2 1
		System.out.print("2. 역순 : ");
		i=n;
		while (i>0) {
			System.out.printf("%d ", i);
			i-=1;
		}
		System.out.println();
		
		// 3. 정수를 입력 받아서 1~n까지의 합계(= 누적합)
		System.out.print("3. 누적합 : ");
		i=1;
		int sum = 0;
		while (i<=n) {
			sum += i;
			i++;
		}
		System.out.printf("%d까지의 누적합 = %d", n, sum);
		System.out.println();
		
		// 4. 상수를 입력 받아서 1~ n까지의 곱(= 누적곱)
		System.out.print("4. 누적곱 : ");
		
		i=1;
		int fac = 1;
		while (i<=n) {
			fac *= i;
			i++;
		}
		System.out.printf("%d까지의 누적곱 = %d", n, fac);
		System.out.println();
		
		// 5. 정수를 입력 받아서 거꾸로 출력
		// ex) 입력 : 123 -> 출력 : 321
		System.out.println("5. 거꾸로 출력>> ");
		int rev = 0;
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		while ( n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		
		System.out.println("rev = " + rev);
		
		
		sc.close();
	}
}
