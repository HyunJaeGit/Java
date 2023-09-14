package loop;

// PDF 반복문 p14

public class Quiz2 {
	public static void main(String[] args) {
		
		System.out.println("문제 1)");
		int n=1000,i,sum=0;
		
		// 1. 1 ~ 1000까지의 합을 구하시오
		for (i=1; i<=n; i++) {
			sum = sum + i;
			
			// 디버깅
			// System.out.printf("i = %d, total = %d\n", i, sum);
		}
		System.out.printf("누적합 : %d", sum);
		System.out.println();
		
		
		
		
		
		// 2. 1 ~ 1000까지의 합을 구하시오(단, 3의 배수는 제외)
		System.out.println("문제 2)");
		n=1000; sum=0;
		
		for (i=1; i<=n; i++) {
			if (i%3!=0)
			sum = sum + i;
		}
		
		System.out.printf("3의배수를 제외한 누적합 : %d", sum);
		System.out.println();
		
		
		
		
		
		// 3. 1 ~ 1000까지의 합을 구하시오(단, 3의 배수는 제외, 3의배수이면서 5의 배수는 합에 포함)
		System.out.println("문제 3)");
		n=1000; sum=0;
		for (i=1; i<=n; i++) {
		
			if (i%3==0 && i%5==0) {
				// 여기는 빈 구문 자체가 의미있다.
			}
			else if (i % 3 == 0) {
				continue;			// 15의 배수는 포함하고 3의 배수는 '제외'
			}
			
			sum += i;
		
		}
			
			
			
		/*	if (i%3!=0) {
				sum += i;
				// System.out.printf("i = %d, total = %d\n", i, sum);
			}
			if (i%3==0 && i%5==0) {
				sum = sum + i;
				// System.out.printf("i = %d, total = %d\n", i, sum);
			}
			
		}
		*/
		System.out.printf("3의 배수제외, 3과 5의 공배수는 포함한 누적합 : %d", sum);
		System.out.println();
	
	
	
	
	
	
	
	
	
	}
}
