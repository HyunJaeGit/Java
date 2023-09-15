package other;

public class Person {
	 protected String name;
	 protected int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public void eat(String food) {
		String msg = "%s(이)가 %s(을)를 먹는다\n";
		System.out.printf(msg, name, food);
		
	}
	
	public void showInfo() {
		String msg = "%s (%d세)\n";
		System.out.printf(msg, name, age);
	}
	
	
	
	
}
