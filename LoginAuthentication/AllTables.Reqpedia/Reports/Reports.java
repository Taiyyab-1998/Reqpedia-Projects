package com.Jdbc_hibernate.spring_jdbc.jobs;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jdDescription;
    private String jdNo;
    private int joined;
    private int noOfProfilesSubmitted;
    private int noProfilesUnderDiscussion;
    private int offered;
    private LocalDateTime timestamp;

    // Fields for percentages
    private double percentageProfileSelected;
    private double percentageProfileRejected;

    // Default constructor
    public Reports() {
    }

    // Parameterized constructor
    public Reports(String jdDescription, String jdNo, int joined, int noOfProfilesSubmitted, int noProfilesUnderDiscussion, int offered, LocalDateTime timestamp) {
        this.jdDescription = jdDescription;
        this.jdNo = jdNo;
        this.joined = joined;
        this.noOfProfilesSubmitted = noOfProfilesSubmitted;
        this.noProfilesUnderDiscussion = noProfilesUnderDiscussion;
        this.offered = offered;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJdDescription() {
        return jdDescription;
    }

    public void setJdDescription(String jdDescription) {
        this.jdDescription = jdDescription;
    }

    public String getJdNo() {
        return jdNo;
    }

    public void setJdNo(String jdNo) {
        this.jdNo = jdNo;
    }

    public int getJoined() {
        return joined;
    }

    public void setJoined(int joined) {
        this.joined = joined;
    }

    public int getNoOfProfilesSubmitted() {
        return noOfProfilesSubmitted;
    }

    public void setNoOfProfilesSubmitted(int noOfProfilesSubmitted) {
        this.noOfProfilesSubmitted = noOfProfilesSubmitted;
    }

    public int getNoProfilesUnderDiscussion() {
        return noProfilesUnderDiscussion;
    }

    public void setNoProfilesUnderDiscussion(int noProfilesUnderDiscussion) {
        this.noProfilesUnderDiscussion = noProfilesUnderDiscussion;
    }

    public int getOffered() {
        return offered;
    }

    public void setOffered(int offered) {
        this.offered = offered;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getPercentageProfileSelected() {
        return percentageProfileSelected;
    }

    public void setPercentageProfileSelected(double percentageProfileSelected) {
        this.percentageProfileSelected = percentageProfileSelected;
    }

    public double getPercentageProfileRejected() {
        return percentageProfileRejected;
    }

    public void setPercentageProfileRejected(double percentageProfileRejected) {
        this.percentageProfileRejected = percentageProfileRejected;
    }

    // Method to calculate percentages
    public void calculatePercentages() {
        int totalProfiles = this.noOfProfilesSubmitted;
        
        if (totalProfiles > 0) {
            this.percentageProfileSelected = (double) this.joined / totalProfiles * 100;
            this.percentageProfileRejected = (double) (totalProfiles - this.joined) / totalProfiles * 100;
        } else {
            this.percentageProfileSelected = 0.0;
            this.percentageProfileRejected = 0.0;
        }
    }
}
