package file;

import java.io.File;
import java.io.IOException;

public class Ex10_FileClass {
	public static void main(String[] args) throws IOException {
		// 파일 처리를 돕는 클래스 File
		
		File f1 = new File("E:\\없는 파일.txt");
		File f2 = new File("E:\\JavaTest.txt");
		File f3 = new File("E:\\JavaFolder");
		
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		
		if (f1.exists() == false) {
			f1.createNewFile();		// - 빈 파일을 생성하는 메서드
									// - 기존 파일이 있으면 아무런 효과가 없음
		}
		
		f3.mkdir();					// 디렉토리를 생성하는 메서드
		
		System.out.println("\nf2는 파일인가? " + f2.isFile());
		System.out.println("f2는 디렉토리인가? " + f2.isDirectory());
		System.out.println("읽기 가능? " + f2.canRead());
		System.out.println("쓰기 가능? " + f2.canWrite());
		System.out.println("실행 가능? " + f2.canExecute());
		System.out.println("파일 이름 ? " + f2.getName());
		System.out.println("실제 경로 ? " + f2.getAbsolutePath());	// (String) 경로
		System.out.println("실제 경로 ? " + f2.getAbsoluteFile());	// (객체) 경로
		System.out.println("파일 크기 ? " + f2.length());	
		
		System.out.println("\nf3는 파일인가? " + f3.isFile());
		System.out.println("f3는 디렉토리인가? " + f3.isDirectory());
		System.out.println("읽기 가능? " + f3.canRead());
		System.out.println("쓰기 가능? " + f3.canWrite());
		System.out.println("실행 가능? " + f3.canExecute());
		System.out.println("파일 이름 ? " + f3.getName());
		System.out.println("실제 경로 ? " + f3.getAbsolutePath());
		System.out.println("파일 크기 ? " + f3.length());

		// 파일 이름에 .txt 확장자명 떼는법
		System.out.println();
		String fileName = f2.getName();
		System.out.println(".위치 : " + fileName.indexOf("."));
		System.out.println("0 ~ 8 : " + fileName.substring(0, 8));
		
	}
}
