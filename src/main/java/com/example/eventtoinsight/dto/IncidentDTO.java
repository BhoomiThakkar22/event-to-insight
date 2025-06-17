package com.example.eventtoinsight.dto;


import java.time.LocalDateTime;

import com.example.eventtoinsight.model.Incident;

public class IncidentDTO {

    private Long id;
    private String title;
    private String description;
    private String severity;
    private String category;
    private LocalDateTime createdAt;

    public IncidentDTO() {}

    public IncidentDTO(Incident incident) {
        this.id = incident.getId();
        this.title = incident.getTitle();
        this.description = incident.getDescription();
        this.severity = incident.getSeverity();
        this.category = incident.getCategory();
        this.createdAt = incident.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public String getCategory() {
        return category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
