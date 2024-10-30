package com.Jdbc_hibernate.spring_jdbc.Cds;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CandidatesRepository extends JpaRepository<Candidates, Long>{

}
