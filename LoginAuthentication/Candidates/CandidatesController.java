package com.Jdbc_hibernate.spring_jdbc.Cds;

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

    @GetMapping
    public List<Candidates> getAllCandidates() {
        return candidatesService.getAllCandidates();
    }

    @PostMapping
    public Candidates createCandidate(@RequestBody Candidates candidate) {
        return candidatesService.createCandidate(candidate);
    }

    @GetMapping("/{id}")  // New endpoint to get a candidate by ID
    public ResponseEntity<Candidates> getCandidateById(@PathVariable long id) {
        Optional<Candidates> candidate = candidatesService.getCandidateById(id);
        return candidate.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
