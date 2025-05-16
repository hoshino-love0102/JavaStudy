import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class PasswordEncryption{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        String encryptedPassword = encryptPassword(password);

        if (encryptedPassword != null) {
            System.out.println("암호화된 비밀번호: " + encryptedPassword);
        }

        scanner.close();
    }

    // SHA-256으로 비밀번호 암호화
    public static String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            // 바이트를 16진수 문자열로 변환
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b)); // 2자리 16진수
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("암호화 알고리즘을 찾을 수 없습니다: " + e.getMessage());
            return null;
        }
    }
}
