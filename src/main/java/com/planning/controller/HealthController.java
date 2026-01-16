package com.planning.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.planning.service.HealthService;
import com.planning.dto.PersonRequest;
import com.planning.model.Person;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        
        this.healthService = healthService;
    }

        @PostMapping(value = "/plan", produces = MediaType.TEXT_HTML_VALUE)
        public String getHealthPlanJson(@RequestBody PersonRequest request) {
        Person user = healthService.createPersonWithClassification(    
            request.getName(),
            request.getAge(),
            request.getWeight(),
            request.getHeight(),
            request.getFrequency()
            );

        String response = String.format(
        "========================================<br>" +
            "CONSULTING REPORT FOR %s (age: %d)<br>" +
        "========================================<br>" +
         "-> BMI: %.2f<br>" +
         "-> Classification: %s<br>" +
        "<br>" +
        "RECOMMENDED ACTION PLAN:<br>" +
        "%s<br>" +
        "========================================<br>",
            user.getName(),
            user.getAge(),
            user.getBmi(),
            user.getClassification(),
            user.getPlanning()
            );

        return response;
        }

    @PostMapping
    public String welcome(){
    return "Healthcare Consulting API is up and running. Use the endpoint: /api/plan";
    }
}
                                                                                                                                                                                                                                                                                                                              
