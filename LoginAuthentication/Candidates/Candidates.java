package com.Jdbc_hibernate.spring_jdbc.Cds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Candidates")
public class Candidates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String phone;
    private String qualification;
    private String experience;

    // Default constructor
    public Candidates() {
    }

    // Parameterized constructor
    public Candidates(long id, String name, String email, String phone, String qualification, String experience) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.qualification = qualification;
        this.experience = experience;
    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Candidates [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", qualification="
                + qualification + ", experience=" + experience + "]";
    }
}
