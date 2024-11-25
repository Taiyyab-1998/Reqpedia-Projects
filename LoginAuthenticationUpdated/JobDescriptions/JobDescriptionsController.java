package com.NewProject.RestWebServices.Restful_webServices.jds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobdescriptions")
public class JobDescriptionsController {

    @Autowired
    private JobDescriptionsService jobDescriptionsService;

    // Get all job descriptions
    @GetMapping
    public List<JobDescriptions> getAllJobDescriptions() {
        return jobDescriptionsService.getAllJobDescriptions();
    }

    // Get a single job description by ID
    @GetMapping("/{id}")
    public ResponseEntity<JobDescriptions> getJobDescriptionById(@PathVariable String id) {
        Optional<JobDescriptions> jobDescription = jobDescriptionsService.getJobDescriptionById(id);
        return jobDescription.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add a new job description
    @PostMapping
    public ResponseEntity<JobDescriptions> createJobDescription(@RequestBody JobDescriptions jobDescription) {
        JobDescriptions createdJobDescription = jobDescriptionsService.saveJobDescription(jobDescription);
        return new ResponseEntity<>(createdJobDescription, HttpStatus.CREATED); // Return 201 Created status
    }

    // Update an existing job description by ID
    @PutMapping("/{id}")
    public ResponseEntity<JobDescriptions> updateJobDescription(@PathVariable String id, @RequestBody JobDescriptions updatedJobDescription) {
        JobDescriptions jobDescription = jobDescriptionsService.updateJobDescription(id, updatedJobDescription);
        if (jobDescription != null) {
            return ResponseEntity.ok(jobDescription);
        }
        return ResponseEntity.notFound().build();
    }

    // Delete a job description by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobDescription(@PathVariable String id) {
        if (jobDescriptionsService.deleteJobDescription(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
