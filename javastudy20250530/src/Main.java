public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("지민");
        Student s3 = new Student("민수", 2);
        Student s4 = new Student("예린", 3, "컴공");

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();
    }
}
