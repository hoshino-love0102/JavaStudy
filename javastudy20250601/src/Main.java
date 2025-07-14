public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("우찌", 17);

        System.out.println("이름: " + s1.getName());
        System.out.println("나이: " + s1.getAge());

        s1.setName("person");
        s1.setAge(20);

        System.out.println("변경된 이름: " + s1.getName());
        System.out.println("변경된 나이: " + s1.getAge());
    }
}
