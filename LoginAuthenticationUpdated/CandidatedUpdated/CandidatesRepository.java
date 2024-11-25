package com.NewProject.RestWebServices.Restful_webServices.CDS;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatesRepository extends MongoRepository<Candidates, Long> {

    // Custom query methods
    List<Candidates> findByName(String name);  // Search candidates by name
    List<Candidates> findByReferredBy(String referredBy);  // Search candidates by referredBy field
}