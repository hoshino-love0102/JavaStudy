public class AvgTest3 {
    static class Avg2 {
        public String name;
        private int avg;
        public String average(int kor, int eng) {
            avg = (kor + eng) / 2;
            return name + " 두 과목 평균 : " + avg;
        }

        public String average(int kor, int eng, int mat) {
            avg = (kor + eng + mat) / 3;
            return name + " 세 과목 평균 : " + avg;
        }
    }

    public static void main(String[] args) {
        Avg2 student1 = new Avg2();
        Avg2 student2 = new Avg2();

        student1.name = "김철수";
        student2.name = "김영희";

        String st1_avg = student1.average(70, 80);
        String st2_avg = student2.average(80, 90, 100);

        System.out.println(st1_avg);
        System.out.println(st2_avg);
    }
}
