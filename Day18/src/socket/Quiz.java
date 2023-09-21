package  socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) throws IOException  {
		ServerSocket serverSk = new ServerSocket(20000);
		System.out.println("서버On. 연결 대기중...");
		
		Socket clientSk = serverSk.accept();
		System.out.println("클라이언트 연결됨");
		
	
		
		Thread inputTh = new Thread(() -> {
			// 여기는 입력 쓰레드
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 : ");
			String msg = sc.nextLine();
			if (msg.equals("0")) {
				try {serverSk.close();} catch (IOException e) {}
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
				try {
					clientSk.close();
				} catch (IOException e) {
				}
			}
		});
			inputTh.start();
			outputTh.start();

		System.out.println("\n연결이 종료 되었습니다");
		
	}
}