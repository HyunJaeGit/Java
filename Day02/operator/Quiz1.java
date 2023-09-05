package operator;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 국 영 수 점수를 저장할 변수를 선언
		// 단, 정수형으로 선언
		// 2. 1번의 변수에 데이터를 채운다
		// 3. 출력 결과는 아래와 같다 (소수점 제어는 하지 않아도 된다)
		// 결과)
		// 성적 : 국 70, 영 80, 수 98
		// 합계 : 248
		// 평균 : 82.666666666666666667
		
		
//		1) 변수 선언
		int kor, eng, mat;
		
//		2) 데이터 채움
		kor = 70;
		eng = 80;
		mat = 98;
		int sum = kor + eng + mat;
		double avg = (double)sum / 3;
		
//		3) 출력
		System.out.println("결과)");
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %f\n", avg);
		
		// Math : 수학 관련 함수(= 기능)을 가진 클래스
		// round() : 전달한 실수를 반올림하는 함수
		avg = Math.round(avg * 100);
		System.out.println("avg = " + avg);
		
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("avg = " + avg);
		
		
	}

}
