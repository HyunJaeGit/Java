package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		// ※ 버퍼 없이 진행시
		// - 속도가 느리다
		FileInputStream fis = new FileInputStream("eclipse.exe");
		FileOutputStream fos = new FileOutputStream("copy.exe");
		
		long start = System.currentTimeMillis();
		System.out.println("읽고 쓰기 시작");
		
		int i;
		
		while ((i = fis.read()) != -1) {
			fos.write(i); 
		}
		
		long end = System.currentTimeMillis();
		System.out.println("읽고 쓰기 완료. 즉, 복사 완료~");
		System.out.println((end - start) / 1000.0 + "초");
		
		fis.close();
		fos.close();
	}
}
