package controlSet;

import java.util.Scanner;

/*
조건문 PDF 10p

2. USB 한 개에 5000원 한다. 그런데 한번에 10개 이상을
구매하면 전체의 10%를 할인해 준다. 100개 이상은
전체의 12%를 할인해준다. N개의 USB를 사려면 얼마가
있어야 하는가

 */

public class Quiz2 {
	public static void main(String[] args) {
		int USB = 5000;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 USB 개수 : ");
		count = sc.nextInt();
		int cost = USB*count;				// USB 구매가격
		
		if (count >= 100) cost *= 0.88;
		else if (count >=10) cost *= 0.9;		// 복합 대입 연산자는 (강제 형변환 해주지 않아도) 
												// 좌변의 자료형에 맞춰 계산된다.
		
		System.out.printf("\nUSB N개를 사기위한 금액 >> %d 원", cost);
		
		sc.close();
	}
}
