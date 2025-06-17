package com.example.eventtoinsight.service;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventtoinsight.dto.IncidentRequest;
import com.example.eventtoinsight.model.Incident;
import com.example.eventtoinsight.repository.IncidentRepository;

@Service
public class IncidentService {

    private static final Logger logger = LoggerFactory.getLogger(IncidentService.class);

    @Autowired
    private IncidentRepository repository;

    @Autowired
    private IncidentClassifier classifier;

    public Incident saveIncident(IncidentRequest request) {
        logger.info("Processing incident: {}", request.getTitle());

        String severity = classifier.predictSeverity(request.getDescription());
        String category = classifier.predictCategory(request.getDescription());

        logger.debug("Predicted Severity: {}, Category: {}", severity, category);

        Incident incident = new Incident();
        incident.setTitle(request.getTitle());
        incident.setDescription(request.getDescription());
        incident.setSeverity(severity);
        incident.setCategory(category);
        incident.setCreatedAt(LocalDateTime.now());

        Incident saved = repository.save(incident);
        logger.info("Incident saved with ID: {}", saved.getId());
        return saved;
    }

    public List<Incident> getAllIncidents() {
        logger.info("Fetching all incidents...");
        return repository.findAll();
    }
}
