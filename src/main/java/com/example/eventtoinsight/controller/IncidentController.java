package com.example.eventtoinsight.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.eventtoinsight.dto.IncidentRequest;
import com.example.eventtoinsight.service.IncidentService;

@Controller
public class IncidentController {

	private static final Logger logger = LoggerFactory.getLogger(IncidentController.class);

    @Autowired
    private IncidentService incidentService;

    @GetMapping("/")
    public String showDashboard(Model model) {
        logger.info("Rendering dashboard page");
        model.addAttribute("incidentForm", new IncidentRequest());
        model.addAttribute("incidents", incidentService.getAllIncidents());
        return "dashboard";
    }

    @PostMapping("/submit")
    public String submitIncident(@ModelAttribute IncidentRequest incidentForm, Model model) {
        logger.info("Received new incident submission: {}", incidentForm.getTitle());
        incidentService.saveIncident(incidentForm);
        return "redirect:/";
    }
}

