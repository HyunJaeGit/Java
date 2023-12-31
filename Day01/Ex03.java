package output;

// ctrl + space	: 이클립스 자동완성 단축키
// main 쓰고 자동완성 단축키를 쓰면 메인함수가 자동으로 완성됨
// syso 쓰고 자동완성 = System.out.println();
public class Ex03 {
	public static void main(String[] args) {
		// println() : 괄호안의 데이터를 화면에 출력, 끝에 개행이 발생
		System.out.println("Hello World!!!");	// 문자열
		System.out.println(10);					// 숫자타입 정수
		System.out.println();					// # 빈 줄 출력으로 사용하기도 한다
		
		// print() : 괄호 안의 데이터를 화면에 출력, 개행이 없다
		System.out.print("Hello");
		System.out.print("Java");
		
		//printf() : format 문자열 출력, 개행이 없다
		System.out.printf(" 이름 : %s, 나이 : %d세", "홍길동", 35);
	}
}
