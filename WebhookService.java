package com.bajajfinserv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bajajfinserv.model.WebhookRequest;
import com.bajajfinserv.model.WebhookResponse;
import com.bajajfinserv.model.SolutionResponse;

@Service
public class WebhookService {
    @Autowired
    private RestTemplate restTemplate;

    public WebhookResponse generateWebhook() {
        String url = "https://bfhldevapigw.healthrx.co.in/hiring/generateWebhook/JAVA";
        
        WebhookRequest request = new WebhookRequest();
        request.setName("John Doe");
        request.setRegNo("REG12347");
        request.setEmail("john@example.com");
        
        return restTemplate.postForObject(url, request, WebhookResponse.class);
    }

    public void submitSolution(String webhookUrl, String token, String query) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        SolutionResponse solution = new SolutionResponse();
        solution.setFinalQuery(query);
        
        HttpEntity<SolutionResponse> entity = new HttpEntity<>(solution, headers);
        restTemplate.postForObject(webhookUrl, entity, String.class);
    }
}