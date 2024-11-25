package com.NewProject.RestWebServices.Restful_webServices.Reports;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository extends MongoRepository<Reports, String> {
    // You can add custom queries here if needed
}
