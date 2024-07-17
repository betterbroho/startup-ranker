package com.example.startup_ranker;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api")
public class UserController {

    // Dummy user data for validation
    private static final Map<String, String> users = new HashMap<>();

    static {
        users.put("admin", "Pa$$word21");
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam String username, @RequestParam String password) {
        Map<String, Object> response = new HashMap<>();
        if (users.containsKey(username) && users.get(username).equals(password)) {
            response.put("status", "success");
        } else {
            response.put("status", "failure");
        }
        return response;
    }
}
