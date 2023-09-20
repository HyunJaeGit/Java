package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) throws Exception {
		// 버퍼 사용시
		// - 속도개선
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jdk8.exe"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy8.exe"));
		
		System.out.println("읽고 쓰기 시작");
		
		int i;
		
		while ((i= bis.read()) != -1) {
			bos.write(i);
		}
		
		System.out.println("복사  완료");
		
		bis.close();
		bos.close();
		
	}
}
