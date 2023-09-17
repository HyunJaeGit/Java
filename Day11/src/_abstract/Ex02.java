package _abstract;

import other.Animal;

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("야옹~");
	}
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("멍멍~");
	}
}



public class Ex02 {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Animal[] anis = new Animal[] { cat, dog };
		
		for (int i=0; i < anis.length; i++) {
			anis[i].eat("사료");
			anis[i].bark();		
		}
		
		
	}
}
