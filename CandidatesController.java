package com.NewProject.RestWebServices.Restful_webServices.CDS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
	@RestController
	@RequestMapping("/api/candidates")
	public class CandidatesController {

	    @Autowired
	    private CandidatesService candidatesService;

	    // Get all candidates
	    @GetMapping
	    public List<Candidates> getAllCandidates() {
	        return candidatesService.getAllCandidates();
	    }

	    // Create a new candidate
	    @PostMapping
	    public Candidates createCandidate(@RequestBody Candidates candidate) {
	        return candidatesService.saveCandidate(candidate);  // Save using the service method
	    }

	    // Get a candidate by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Candidates> getCandidateById(@PathVariable long id) {
	        Optional<Candidates> candidate = candidatesService.getCandidateById(id);
	        return candidate.map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    // Get candidates by name (optional, if needed)
	    @GetMapping("/search/name/{name}")
	    public List<Candidates> getCandidatesByName(@PathVariable String name) {
	        return candidatesService.getCandidatesByName(name);
	    }

	    // Get candidates by referredBy field (optional, if needed)
	    @GetMapping("/search/referredBy/{referredBy}")
	    public List<Candidates> getCandidatesByReferredBy(@PathVariable String referredBy) {
	        return candidatesService.getCandidatesByReferredBy(referredBy);
	    }

	    // Delete candidate by ID (optional)
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCandidate(@PathVariable long id) {
	        if (candidatesService.candidateExists(id)) {
	            candidatesService.deleteCandidate(id);
	            return ResponseEntity.noContent().build(); // 204 No Content
	        }
	        return ResponseEntity.notFound().build(); // 404 Not Found
	    }
	}