package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09_FileScan {
	public static void main(String[] args) throws Exception {
		// ※ 단순한 텍스트를 읽어올땐 Scanner를 사용하면 더욱 쉽다
		File file = new File("C:\\Windows\\System32\\drivers\\etc");			// 1) File - 파일 경로
		Scanner sc = new Scanner(file);											// 2) Scanner(File)
		
		while (sc.hasNextLine()) {												// 3) sc.hasNextLine 으로 파일 끝까지 println함
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		
		
		
	}
}
