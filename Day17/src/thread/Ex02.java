package thread;

/*
	Thread는 클래스임
	따라서, 상속받으면 다른 클래스의 상속이 불가능
	이를 해결하기위해서 Runnable이라는 인페이스가 있음
	
	※ Runnable 는 함수형 인터페이스 -> 람다식 구현가능
*/

// Thread를 직접 상속 받지 않아도 됨
class Test2 implements Runnable {

	@Override
	public void run() {
		for (int i = 5; i>0; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}System.out.println();
	}
	
	
}


public class Ex02 {
	public static void main(String[] args) {
		
		Test2 test = new Test2();
		
		test.run();
		test.run();
		// - 그냥 run()을 호출한것임
		// - 새 쓰레드는 생성되지 않음
		
		Thread th1 = new Thread(test);
		Thread th2 = new Thread(test);
		// runnable을 구현한 객체를 Thread 생성자에 전달
		
		
		th1.start();
		th2.start();
		// Thread 객체로 새 쓰레드를 생성
		
		System.out.println("main은 끝났어요~");
		
	}
}
