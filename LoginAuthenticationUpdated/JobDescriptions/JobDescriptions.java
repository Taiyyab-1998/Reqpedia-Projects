package com.NewProject.RestWebServices.Restful_webServices.jds;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.text.DecimalFormat;

@Document(collection = "JobDescriptions")
public class JobDescriptions {

    @Id
    private String id; // MongoDB typically uses String for ID
    private String companyName;
    private String location;
    private String employeeType;
    private String expectedBudget;
    private String experienceRequired;
    private String jobRole;

    // Default constructor
    public JobDescriptions() {
    }

    // Parameterized constructor
    public JobDescriptions(String id, String companyName, String location, String employeeType, String expectedBudget, String experienceRequired, String jobRole) {
        this.id = id;
        this.companyName = companyName;
        this.location = location;
        this.employeeType = employeeType;
        this.expectedBudget = expectedBudget;
        this.experienceRequired = experienceRequired;
        this.jobRole = jobRole;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getExpectedBudget() {
        return expectedBudget;
    }

    public void setExpectedBudget(String expectedBudget) {
        this.expectedBudget = expectedBudget;
    }

    public String getExperienceRequired() {
        return experienceRequired;
    }

    public void setExperienceRequired(String experienceRequired) {
        this.experienceRequired = experienceRequired;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    // Method to generate a job ID in the format JD00001
    public void generateJobId(Long jobNumber) {
        // Format job ID with leading zeros
        DecimalFormat df = new DecimalFormat("JD00000");
        this.id = df.format(jobNumber);
    }

    @Override
    public String toString() {
        return "JobDescriptions [id=" + id + ", companyName=" + companyName + ", location=" + location + ", employeeType=" + employeeType
                + ", expectedBudget=" + expectedBudget + ", experienceRequired=" + experienceRequired + ", jobRole=" + jobRole + "]";
    }

}
