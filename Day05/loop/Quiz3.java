package loop;


// 반복문 PDF 15p

/* 10.첫날에는 1원을 예금하고, 다음날에는 전날의 2배의 금액을
예금하는 방식으로 한달(30일) 동안 저축한 금액을 출력
Ex) 1일) 예금액 : 1원, 총액 : 1원
2일) 예금액 : 2원, 총액 : 3원
3일) 예금액 : 4원, 총액 : 7원
…..
한달 동안 저축한 금액 : 1073741823원
*/

public class Quiz3 {
	public static void main(String[] args) {
		int money = 1;
		int total = 0;
		
		for (int day = 1; day <=30; day++) {
			total += money;
			
			money *= 2;
			
			// 디버깅
			System.out.printf("%d일) 예금 : %d원, 총액 %d원\n", day, money, total);
		}
		System.out.println("총 금액 : " + total + "원");
		
		
		
	}
}
