package com.Jdbc_hibernate.spring_jdbc.jobs;

import com.Jdbc_hibernate.spring_jdbc.jobs.Reports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository extends JpaRepository<Reports, Long> {
}
