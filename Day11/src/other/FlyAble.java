package other;
/*
	인터페이스
	- 아무것도 구현되지 않음 껍데기 클래스
	- 자바에서 다중 상속이 가능한 타입
	- 필드는 public static final 속성이 되고
	- 메서드는 public abstract가 된다
*/
public interface FlyAble {
	String type = "날개";			// type - static속성 (기울임체)
								// "날개" - final(불변)속성
	
	public abstract void fly();	// 메서드는 자동으로, 
								// - public abstract가 생략됨
}
