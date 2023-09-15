package inheritance;

// Object 클래스
// - Java의 최상위 클래스
// - Java의 모든 클래스는 예외 없이 Object를 상속 받는다

class Po extends Object {	// Object는 작성하지 않아도 자동으로 상속됨
	private int x, y;
	
	Po(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Po other = (Po) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}

public class Ex05_Object {
	public static void main(String[] args) {
		Po p1 = new Po(3, 2);
		Po p2 = new Po(3, 2);
		Po p3 = p1;
		
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString());
		// - 출력에 참조변수를 두면 toString()를 호출하게 되어있다
		
		System.out.println();
		System.out.println("p1 = " + p1.hashCode());
		System.out.println("p1 = " + Integer.toHexString(p1.hashCode()));
		
		System.out.println();
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3 + "\n");
		
		System.out.println();
		System.out.printf("p1 = %x\n", p1.hashCode());
		System.out.printf("p2 = %x\n", p2.hashCode());
		System.out.printf("p3 = %x\n\n", p3.hashCode());
		
		System.out.println();
		System.out.println("p1 == p2 결과 : " + (p1 == p2));
		System.out.println("p1 == p3 결과 : " + (p1 == p3));
		// - 참조변수의 비교는 같은 객체(=인스턴스)를 가리키는가 비교 (파이썬튜터로 확인)
		// - 즉, 필드를 비교하는게 아니다
		
		System.out.println();
		System.out.println("p1.equals(p2) 결과 : " + p1.equals(p2));
		System.out.println("p1.equals(p3) 결과 : " + p1.equals(p3));
		// - equals()의 그냥 쓰면 == 와 동일한 효과
		// - 오버라이드가 가능하기 때문에 원하는 빌드를 비교하게 변경 가능
		
	}
}

	
