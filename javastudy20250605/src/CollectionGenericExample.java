import java.util.*;

public class CollectionGenericExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 90));
        students.add(new Student("김철수", 85));
        students.add(new Student("이영희", 95));

        System.out.println("학생 목록 (List)");
        for (Student s : students) {
            System.out.println(s);
        }

        Set<String> subjects = new HashSet<>();
        subjects.add("국어");
        subjects.add("수학");
        subjects.add("영어");
        subjects.add("수학");

        System.out.println("\n과목 목록 (Set)");
        for (String sub : subjects) {
            System.out.println(sub);
        }

        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("홍길동", 90);
        scoreMap.put("김철수", 85);
        scoreMap.put("이영희", 95);

        System.out.println("\n성적표 (Map)");
        for (String name : scoreMap.keySet()) {
            System.out.println(name + " -> " + scoreMap.get(name) + "점");
        }
    }
}
