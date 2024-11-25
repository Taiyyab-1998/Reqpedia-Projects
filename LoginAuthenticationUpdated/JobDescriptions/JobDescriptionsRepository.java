package com.NewProject.RestWebServices.Restful_webServices.jds;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDescriptionsRepository extends MongoRepository<JobDescriptions, String> {
    // You can add custom queries here if needed
}
