package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Student implements Comparable<Student> {
	String name;
	int kor, eng, mat;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	
	int getTotal() {
		return kor + eng + mat;
	}
	@Override
	public String toString() {
		return String.format("%s >> %d 점", name, getTotal());
	}

	@Override
	public int compareTo(Student o) {
		return o.getTotal()	- getTotal();
	}

}


public class Quiz2 {
	public static void main(String[] args) {
		// 1. 학생 정보를 입력 받는다
		// - 3명 정도 입력 받고, 이름 국영수를 입력받는다
		// 2. 입력받은 정보로 Student 인스턴스를 생성 및 리스트에 추가
		// 3. 성적순으로 출력
		int num;
		
		Scanner sc = new Scanner(System.in);				// 스캐너
		List<Student> list = new ArrayList<Student>();		// 학생 목록
		System.out.println("입력할 학생 수 >> ");
		num = sc.nextInt();
		
		for (int i=0; i < num; i++) {						// 학생 정보 입력 받기
			System.out.println("\n▶학생 이름 입력 >> ");
			
			String name = sc.next();
			System.out.print("국어 점수 입력: "); int kor = sc.nextInt();	        
	        System.out.print("영어 점수 입력: "); int eng = sc.nextInt();
	        System.out.print("수학 점수 입력: "); int mat = sc.nextInt();
	        
	        list.add(new Student(name, kor, eng, mat));
		}
//		System.out.println("list = " + list); 디버깅
		
		
		// 성적순 출력
		list.sort(null);
		for (Student student : list) {
			System.out.println(student);
	    }
		sc.close();
	}
}
