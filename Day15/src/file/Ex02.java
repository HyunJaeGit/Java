package file;

import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("test1.txt");
		char[] buf = new char[100];
		
		fr.read(buf);
		
		System.out.println(buf);
		
		System.out.println("\n파일 읽기 완료~");
		fr.close();
	}
}
