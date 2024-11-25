package com.NewProject.RestWebServices.Restful_webServices.jds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobDescriptionsService {

    @Autowired
    private JobDescriptionsRepository jobDescriptionsRepository;

    // Get all job descriptions
    public List<JobDescriptions> getAllJobDescriptions() {
        return jobDescriptionsRepository.findAll();
    }

    // Get a single job description by ID
    public Optional<JobDescriptions> getJobDescriptionById(String id) {
        return jobDescriptionsRepository.findById(id);
    }

    // Add a new job description
    public JobDescriptions saveJobDescription(JobDescriptions jobDescription) {
        // Generate a unique ID if it's null (for new job descriptions)
        if (jobDescription.getId() == null || jobDescription.getId().isEmpty()) {
            Long jobCount = jobDescriptionsRepository.count() + 1;
            jobDescription.generateJobId(jobCount);  // Call the instance method to generate the ID
        }
        return jobDescriptionsRepository.save(jobDescription);
    }

    // Update an existing job description
    public JobDescriptions updateJobDescription(String id, JobDescriptions updatedJobDescription) {
        if (jobDescriptionsRepository.existsById(id)) {
            updatedJobDescription.setId(id);  // Ensure the ID remains the same during update
            return jobDescriptionsRepository.save(updatedJobDescription);
        }
        return null;  // Return null if the job description doesn't exist
    }

    // Delete a job description by ID
    public boolean deleteJobDescription(String id) {
        if (jobDescriptionsRepository.existsById(id)) {
            jobDescriptionsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
