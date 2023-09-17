package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("date = " + date); 		// 해시코드가 안나오고 날짜가 나옴 == toString이 이미 오버라이딩 되어있다.
				

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일  a HH:mm:ss E요일");		
													// 1) 참조변수 sdf 에 생성자()의 형식에 저장
		String time = sdf.format(date);				// 2) time 변수에 sdf의 형식으로 date의 정보를 포맷팅
		System.out.println("time = " + time);		// 3) 출력
	}
}
