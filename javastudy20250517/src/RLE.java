import java.util.Scanner;

public class RLE {

    public static String runLengthEncode(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        char prev = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                result.append(prev).append(count);
                prev = curr;
                count = 1;
            }
        }

        result.append(prev).append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력: ");
        String input = scanner.nextLine();

        String encoded = runLengthEncode(input);
        System.out.println("압축 결과: " + encoded);
    }
}
