package com.bajajfinserv.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.bajajfinserv.service.WebhookService;
import com.bajajfinserv.service.SolutionService;

@Component
public class StartupRunner implements ApplicationRunner {
    @Autowired
    private WebhookService webhookService;
    
    @Autowired
    private SolutionService solutionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Generate webhook
        var response = webhookService.generateWebhook();
        
        // Get solution query based on regNo
        String query = solutionService.getSolutionQuery("REG12347");
        
        // Submit solution
        webhookService.submitSolution(response.getWebhook(), response.getAccessToken(), query);
        
        System.out.println("Process completed successfully!");
    }
}