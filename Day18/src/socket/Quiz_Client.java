package socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;



public class Quiz_Client {
	public static void main(String[] args) throws IOException  {
		Socket socket = new Socket("localhost", 20000);
		System.out.println("서버에 연결됨");
		
		
		
		Thread inputTh = new Thread(() -> {
			// 여기는 입력 쓰레드
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 : ");
			String msg = sc.nextLine();
			if (msg.equals("0")) {
				try {socket.close();} catch (IOException e) {}
				System.out.println("\n 연결이 종료 되었습니다");
			}
			sc.close();
			
		});
		
		Thread outputTh = new Thread(() ->  {
			// 여기는 출력 쓰레드
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + "번 출력");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});
		
		inputTh.start();
		outputTh.start();

		socket.close();
		System.out.println("\n 연결이 종료 되었습니다");
		
	}
}