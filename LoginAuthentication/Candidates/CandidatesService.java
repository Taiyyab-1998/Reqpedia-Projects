package com.Jdbc_hibernate.spring_jdbc.Cds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatesService {

    @Autowired
    private CandidatesRepository candidatesRepository;

    public List<Candidates> getAllCandidates() {
        return candidatesRepository.findAll();
    }

    public Candidates createCandidate(Candidates candidate) {
        return candidatesRepository.save(candidate);
    }

    public Optional<Candidates> getCandidateById(long id) {
        return candidatesRepository.findById(id);
    }
}
