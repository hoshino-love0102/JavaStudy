package com.example.project_sori.controller;

import com.example.project_sori.domain.User;
import com.example.project_sori.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;

    // 회원가입 폼 페이지
    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup"; // templates/signup.html
    }

    // 회원가입 처리
    @PostMapping("/signup")
    public String signup(@ModelAttribute User user) {
        // 선배/후배 구분
        if ("선배".equals(user.getGeneration())) {
            user.setRole(User.Role.SENIOR);
        } else {
            user.setRole(User.Role.JUNIOR);
        }
        userRepository.save(user);
        return "redirect:/login";
    }

    // 로그인 폼 페이지
    @GetMapping("/login")
    public String loginForm() {
        return "login"; // templates/login.html
    }

    // 로그인 처리
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {

        Optional<User> userOpt = userRepository.findByUsername(username);
        if (userOpt.isPresent() && userOpt.get().getPassword().equals(password)) {
            session.setAttribute("user", userOpt.get());
            return "redirect:/main";
        }

        model.addAttribute("error", "아이디 또는 비밀번호가 틀렸습니다.");
        return "login";
    }

    // 로그아웃
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    // 메인 페이지
    @GetMapping("/main")
    public String mainPage(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        model.addAttribute("nickname", user.getNickname());
        return "main";
    }
}
