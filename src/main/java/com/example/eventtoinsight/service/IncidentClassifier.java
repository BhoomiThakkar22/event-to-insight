package com.example.eventtoinsight.service;

import org.springframework.stereotype.Component;

@Component
public class IncidentClassifier {

    public String predictSeverity(String description) {
        if (description.toLowerCase().contains("system down")) return "Critical";
        if (description.toLowerCase().contains("slow")) return "Medium";
        return "Low";
    }

    public String predictCategory(String description) {
        if (description.toLowerCase().contains("login")) return "Access";
        if (description.toLowerCase().contains("router") || description.contains("LAN")) return "Network";
        return "Software";
    }
}

