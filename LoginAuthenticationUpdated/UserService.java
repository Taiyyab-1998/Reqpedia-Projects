package com.NewProject.RestWebServices.Restful_webServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserReqRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Find user by email with case insensitivity
    public UserReq findByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }

    // Register a new user with hashed password
    public UserReq registerUser(UserReq user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // Authenticate user based on email and password
    public boolean authenticate(String email, String password) {
        UserReq user = findByEmail(email);  // Case-insensitive email lookup
        return user != null && passwordEncoder.matches(password, user.getPassword());
    }

    // Determine user's role and redirect accordingly
    public String getRoleBasedPage(String email, String password) {
        if (authenticate(email, password)) {
            UserReq user = findByEmail(email);  // Retrieve the user from MongoDB
            String role = user.getRole();

            if ("admin".equalsIgnoreCase(role)) {
                return "redirect:/adminPage";
            } else if ("recruiter".equalsIgnoreCase(role)) {
                return "redirect:/recruiterPage";
            } else {
                return "redirect:/defaultPage";
            }
        } else {
            return "redirect:/login?error=true";
        }
    }
}
