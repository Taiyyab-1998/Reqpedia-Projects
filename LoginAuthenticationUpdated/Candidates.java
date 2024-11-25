package com.NewProject.RestWebServices.Restful_webServices.CDS;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Candidates")
public class Candidates {
	@Id
    private String id; // MongoDB typically uses String for ID
    private String name;
    private String email;
    private String phone;
    private String qualification;
    private String experience;
    private String referredBy; // New field for "Referred by" with null support

    // Default constructor
    public Candidates() {
    }

    // Parameterized constructor
    public Candidates(String id, String name, String email, String phone, String qualification, String experience, String referredBy) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.qualification = qualification;
        this.experience = experience;
        this.referredBy = referredBy;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    // Method to generate a custom ID
    public static String generateCustomId(long count) {
        return "CD" + String.format("%05d", count);  // e.g., CD00001, CD00002, etc.
    }
    
    @Override
    public String toString() {
        return "Candidates [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", qualification="
                + qualification + ", experience=" + experience + ", referredBy=" + referredBy + "]";
    }
}
