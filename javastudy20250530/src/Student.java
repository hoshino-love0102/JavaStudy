class Student {
    String name;
    int grade;
    String major;

    Student() {
        this("이름없음", 1, "미정");
    }

    Student(String name) {
        this(name, 1, "미정");
    }

    Student(String name, int grade) {
        this(name, grade, "미정");
    }

    Student(String name, int grade, String major) {
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    void printInfo() {
        System.out.println("이름: " + name + ", 학년: " + grade + ", 전공: " + major);
    }
}
