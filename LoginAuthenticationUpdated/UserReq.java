package com.NewProject.RestWebServices.Restful_webServices;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_req")  // The name of the collection in MongoDB
public class UserReq {

    @Id
    private String id;  // MongoDB uses String or ObjectId for the ID

    private String email;  // Renamed from username to email
    private String password;
    private String role;

    // No-argument constructor
    public UserReq() {
        // This constructor is required by MongoDB
    }

    // Parameterized constructor
    public UserReq(String id, String email, String password, String role) {
        super();
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserReq [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + "]";
    }
}
