package com.example.bcrypt;

import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class BcryptExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println("암호화된 비밀번호: " + hashed);
        System.out.print("비밀번호를 다시 입력하세요 (검증): ");
        String confirmPassword = scanner.nextLine();
        boolean matched = BCrypt.checkpw(confirmPassword, hashed);
        System.out.println("일치 여부: " + matched);

        scanner.close();
    }
}