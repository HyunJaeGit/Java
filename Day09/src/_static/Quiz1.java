package _static;

class Student {
    private String name;
    private int score;
    private static int count = 0;

    Student(String name, int score) {
        this.score = score;
        this.name = name;
        count++;
    }

    void showInfo() {
        System.out.printf("%s (%d점) - %d명\n", name, score, count);
    }

    public static int getCount() {
        return count;
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        Student stu1 = new Student("홍길동", 80);
        stu1.showInfo(); // 홍길동 (80점) - 1명

        Student stu2 = new Student("김수진", 77);
        stu2.showInfo(); // 김수진 (77점) - 2명

        Student stu3 = new Student("이진호", 93);
        stu3.showInfo(); // 이진호 (93점) - 3명

        System.out.println("\n현재 학급 인원 : " + Student.getCount());

        stu1.showInfo();
        stu2.showInfo();
        stu3.showInfo();
    }
}
