package socket;

import java.io.IOException;
import java.net.Socket;

public class Ex01_client {
	public static void main(String[] args) throws IOException, IOException {
		Socket socket = new Socket("localhost", 10000); 			// (상대방 서버주소(IP), 포트번호)
		System.out.println("서버에 연결됨");							// - localhost : 자기자신
		
		socket.close();
		System.out.println("\n 연결이 종료 되었습니다.");
		
	}
}
