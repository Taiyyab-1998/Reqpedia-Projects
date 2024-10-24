package com.Jdbc_hibernate.spring_jdbc.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportsController {

    @Autowired
    private ReportsService reportsService;

    @GetMapping
    public List<Reports> getAllReports() {
        return reportsService.getAllReports();
    }

    @PostMapping
    public Reports createReport(@RequestBody Reports report) {
        return reportsService.createReport(report);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reports> getReportById(@PathVariable Long id) {
        Reports report = reportsService.getReportById(id);
        if (report == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(report);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
        reportsService.deleteReport(id);
        return ResponseEntity.noContent().build();
    }
}
