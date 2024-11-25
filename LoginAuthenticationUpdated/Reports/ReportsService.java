package com.NewProject.RestWebServices.Restful_webServices.Reports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportsService {

    @Autowired
    private ReportsRepository reportsRepository;

    // Retrieve all reports from the database
    public List<Reports> getAllReports() {
        return reportsRepository.findAll();
    }

    // Create a new report
    public Reports createReport(Reports report) {
        // Calculate percentages before saving the report
        calculatePercentages(report);
        return reportsRepository.save(report);
    }

    // Retrieve a report by its ID
    public Reports getReportById(String id) {
        return reportsRepository.findById(id).orElse(null);
    }

    // Delete a report by its ID
    public void deleteReport(String id) {
        reportsRepository.deleteById(id);
    }

    // Calculate percentage values for the report
    private void calculatePercentages(Reports report) {
        int totalProfiles = report.getNoOfProfilesSubmitted();

        // Avoid division by zero
        if (totalProfiles > 0) {
            report.setPercentageProfileSelected((double) report.getJoined() / totalProfiles * 100);
            report.setPercentageProfileRejected((double) (totalProfiles - report.getJoined()) / totalProfiles * 100);
        } else {
            report.setPercentageProfileRejected(0.0);
            report.setPercentageProfileSelected(0.0);
        }
    }
}
