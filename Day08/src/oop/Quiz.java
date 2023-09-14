package oop;

class Po {
	int x, y;
	
	Po(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPo() {
		System.out.printf("(%d, %d)\n", x, y);
	}
	
	Po addPo(Po p) {
		int x = this.x + p.x;
		int y = this.y + p.y;
		
		Po tmp = new Po(x, y);
		
		return tmp;
		
		
	}
}


public class Quiz {
	public static void main(String[] args) {
		// 아래 코드가 실행되게 클래스를 구현
		
		Po p1 = new Po(5, 3);		// x,y
		Po p2 = new Po(7, 5);
		
		p1.showPo();
		p2.showPo();
		
		Po p3 = p1.addPo(p2);
		
		p3.showPo();
		
		
	}
}
