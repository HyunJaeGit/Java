package accessModifier;

import other.Person;

/*
 		접근 제어 지시자
 		- 클래스의 멤버에 접근하는 청도를 지정하는 키워드
 		
 		1. private		: 클래스 내에서만 접근 가능
 		2. package		: 내부 + 같은 패키지까지만
 		3. protected	: 내부 + 패키지 + 상속 받은 자식 클래스까지만 접근 가능
 		4. public		: 내부 + 패키지 + 상속 + 외부, 즉, 어디서든 접근 가능
 */



public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍진호", 22, 172.2);
		
		p1.name = "홍길동";
//		p1.age = 30;				package는 다른 패키지에서 참조 불가
//		p1.height = 175.3;			private은 클래스 외부에서 참조 불가
		
		p1.showInfo();
	}
}
