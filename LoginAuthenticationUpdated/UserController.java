package com.NewProject.RestWebServices.Restful_webServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService; // Handles user logic

    @Autowired
    private JwtUtil jwtUtil; // For JWT token generation

    // Endpoint to register a new user
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserReq user) {
        if (userService.findByEmail(user.getEmail()) != null) { // Check if user already exists
            return ResponseEntity.badRequest().body("User already exists!"); // If user exists
        }
        userService.registerUser(user); // Register new user
        return ResponseEntity.ok("User registered successfully!"); // Successful registration
    }

    // Endpoint to log in a user
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserReq user) {
        if (userService.authenticate(user.getEmail(), user.getPassword())) { // Authenticate user
            // Generate JWT token if authentication is successful
            String token = jwtUtil.generateToken(user.getEmail()); // Generate token with user email
            return ResponseEntity.ok("Login successful! Token: " + token); // Return token
        } else {
            return ResponseEntity.badRequest().body("Invalid credentials!"); // Invalid login
        }
    }

    // Endpoint to get a user by email
    @GetMapping("/user/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email) { // PathVariable for email
        UserReq user = userService.findByEmail(email); // Find user by email
        if (user != null) {
            return ResponseEntity.ok(user); // Return user details
        } else {
            return ResponseEntity.badRequest().body("User not found!"); // If user is not found
        }
    }
}