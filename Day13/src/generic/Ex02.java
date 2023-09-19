package generic;


class Box<T> {
	private T value;
	
	Box(T value) {
		this.value = value;
	}
	
	T getValue() {
		return value;
	}	
}


public class Ex02 {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(10);
		Box<String> b2 = new Box<String>("Java");
		Box<Person> b3 = new Box<Person>(new Person("홍길동", 30));
		
		
		System.out.println("b1 값 : " + b1.getValue());
		System.out.println("b2 값 : " + b2.getValue());
		System.out.println("b3 값 : " + ((Person)b3.getValue()).getName());
		
		
	}
}
