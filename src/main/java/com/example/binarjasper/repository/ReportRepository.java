package com.example.binarjasper.repository;

import com.example.binarjasper.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}