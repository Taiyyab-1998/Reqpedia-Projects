package com.NewProject.RestWebServices.Restful_webServices.CDS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatesService {

    @Autowired
    private CandidatesRepository candidatesRepository;

    // Get all candidates
    public List<Candidates> getAllCandidates() {
        return candidatesRepository.findAll();
    }

    // Save candidate
    public Candidates saveCandidate(Candidates candidate) {
        long count = candidatesRepository.count() + 1; // This is how we track the next ID.
        String customId = Candidates.generateCustomId(count);  // Generate the custom ID
        candidate.setId(customId);
        return candidatesRepository.save(candidate);  // Save the candidate
    }


    // Get candidate by ID
    public Optional<Candidates> getCandidateById(long id) {
        return candidatesRepository.findById(id);
    }

    // Get candidates by name
    public List<Candidates> getCandidatesByName(String name) {
        return candidatesRepository.findByName(name);
    }

    // Get candidates by referredBy field
    public List<Candidates> getCandidatesByReferredBy(String referredBy) {
        return candidatesRepository.findByReferredBy(referredBy);
    }

    // Check if a candidate exists by ID
    public boolean candidateExists(long id) {
        return candidatesRepository.existsById(id);
    }

    // Delete candidate by ID
    public void deleteCandidate(long id) {
        candidatesRepository.deleteById(id);
    }
}