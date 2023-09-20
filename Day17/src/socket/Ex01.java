package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 소켓 (socket)
// - 네트워크 통신을 가능하게하는 프로그래밍 인터페이스를 의미
// - 자바는 Socket이라는 객체를 이미 제공 중


public class Ex01 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSk = new ServerSocket(10000);	// 서버 생성자(포트번호)
		
		System.out.println("서버 On >> 연결 대기중...");
		Socket clientSk = serverSk.accept();				// 연결대기
		
		System.out.println("클라이언트 연결!!!");
		System.out.println("접속 IP : " + clientSk.getInetAddress());
		System.out.println("접속 PORT : " + clientSk.getPort());
		
		
		serverSk.close();
		clientSk.close();
		System.out.println("\n접속이 종료 되었습니다.");
		
	}
}
