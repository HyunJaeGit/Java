package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("Ex05.class");
		byte[] buf = new byte[2048];
		
		
		fis.read(buf);
		System.out.println(Arrays.toString(buf));
		
		// ※ 바이트 배열 -> 문자열은 문자열 생성자로 손쉽게 처리 가능
		String str = new String(buf);
		System.out.println(str);
		
		System.out.println("\n읽어오기 완료~");
		fis.close();
		
		
		
	}
}
