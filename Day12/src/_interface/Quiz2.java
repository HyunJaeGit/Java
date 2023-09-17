package _interface;


import java.util.Arrays;
import java.util.Comparator;


class Student {
	private String name;
	private int kor,eng,mat;
	
	public Student(String name, int kor, int eng, int mat) {
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
	
	public int getTotal() {
		return kor + eng + mat;
	}
	
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o2.getTotal(), o1.getTotal());
	}
	
}


public class Quiz2 {
	public static void main(String[] args) {
		// 아래 클래스를 작성 후 성적 순으로 내림 차순 출력
		Student[] stus = new Student[] {
			new Student("홍길동", 70, 80, 98),
			new Student("김민지", 90, 77, 85),
			new Student("박철민", 88, 91, 70)
		};
		
		Arrays.sort(stus, new StudentComparator());

        // 정렬된 학생들 출력
		for (int i = 0; i < stus.length; i++) {
		    Student student = stus[i];
		    System.out.print((i+1)+ ". " + student.getName());
		    System.out.printf(" 국어(%d), 영어(%d), 수학(%d) ",
		    		student.getKor(), student.getEng(), student.getMat());
		    System.out.println(" 총점 : " + student.getTotal());
		}
		
		/*
        for (Student student : stus) {
            System.out.println(student.getName() + " 총점: " + student.getTotal());
        }
        */
		
	}
}
