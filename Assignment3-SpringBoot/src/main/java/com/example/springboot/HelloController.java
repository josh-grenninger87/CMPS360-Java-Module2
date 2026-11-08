
package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    // Path 1 - Original Welcome Message
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    // Path 2 - Student Grade
    @GetMapping("/grade")
    public String grade(@RequestParam(defaultValue = "85") int score) {
        if (score >= 90) {
            return "Your grade is an A!";
        } else if (score >= 80) {
            return "Your grade is a B!";
        } else if (score >= 70) {
            return "Your grade is a C!";
        } else if (score >= 60) {
            return "Your grade is a D!";
        } else {
            return "Your grade is an F!";
        }
    }

    // Path 3 - Gaming Performance
    @GetMapping("/gaming")
    public String gaming(@RequestParam(defaultValue = "60") int fps) {
        if (fps >= 120) {
            return "Excellent gaming performance!";
        } else if (fps >= 60) {
            return "Good gaming performance!";
        } else if (fps >= 30) {
            return "Average gaming performance.";
        } else {
            return "Poor gaming performance!";
        }
    }

    // Path 4 - Password Strength
    @GetMapping("/password")
    public String password(@RequestParam(defaultValue = "8") int length) {
        if (length >= 16) {
            return "Strong password length!";
        } else if (length >= 12) {
            return "Good password length!";
        } else if (length >= 8) {
            return "Password could be stronger!";
        } else {
            return "Password is too short!";
        }
    }
}
