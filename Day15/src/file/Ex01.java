package file;

import java.io.FileWriter;
import java.io.IOException;

/*
	file : 파일, 디스크에 저장되는 데이터
	- 디스크는 보조 저장장치로 데이터가 영구적으로 저장될 수 있다
	
	입력 : 프로그램으로 데이터가 들어오는 것
	출력 : 프로그램에서 데이터가 나가는 것
	
	파일 출력 : 쓰기
	파일 입력 : 읽기
	
	바이트 단위		: FileInputStream, FileOutputStream
	문자 단위		: FileReader, FileWriter
*/

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("test1.txt");
		
		fw.write("Hello, World!!!");
		
		fw.close();
	}
}
