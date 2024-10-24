package com.Jdbc_hibernate.spring_jdbc.New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // For password hashing

    // Find user by username
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Register a new user with hashed password
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Hash the password
        return userRepository.save(user);
    }

    // Authenticate user based on username and password
    public boolean authenticate(String username, String password) {
        User user = findByUsername(username);
        return user != null && passwordEncoder.matches(password, user.getPassword());
    }

    // Determine user's role and redirect accordingly
    public String getRoleBasedPage(String username, String password) {
        if (authenticate(username, password)) {  // Check if the user is authenticated
            User user = findByUsername(username);
            String role = user.getRole();

            // Redirect based on the user's role
            if ("admin".equalsIgnoreCase(role)) {
                return "redirect:/adminPage";  // Example redirect for admin
            } else if ("recruiter".equalsIgnoreCase(role)) {
                return "redirect:/recruiterPage";  // Example redirect for recruiter
            } else {
                return "redirect:/defaultPage";  // Default page if no specific role
            }
        } else {
            return "redirect:/login?error=true";  // If authentication fails
        }
    }
}
