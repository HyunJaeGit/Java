package generic;

class Po<T> {
	private T x;
	private T y;
	private T z;
	
	Po(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	T getz() {
		return z;
	}

	T getx() {
		return x;
	}
	
	T gety() {
		return y;
	}
	
	@Override
	public String toString() {
		
		return String.format("(%s, %s)", x, y);
	}
	
}



public class Quiz {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성
		
		Po<Integer> p1 = new Po<Integer>(5,3);
		Po<Double> p2 = new Po<Double>(3.14,6.79);
		Po<String> p3 = new Po<String>("Java", "Pyton");
		
		System.out.println("x,y,z : " + p1);
		System.out.println("x,y,z : " + p2);
		System.out.println("x, y, z: " + p3);
	}
}
