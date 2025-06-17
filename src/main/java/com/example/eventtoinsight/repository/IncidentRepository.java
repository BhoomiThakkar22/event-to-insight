package com.example.eventtoinsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventtoinsight.model.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Long> { }

