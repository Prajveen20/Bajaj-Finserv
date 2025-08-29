package com.bajajfinserv.service;

import org.springframework.stereotype.Service;

@Service
public class SolutionService {
    public String getSolutionQuery(String regNo) {
        // Extract last two digits
        String lastTwoDigitsStr = regNo.substring(regNo.length() - 2);
        int lastTwoDigits = Integer.parseInt(lastTwoDigitsStr);
        
        // Determine if odd or even
        if (lastTwoDigits % 2 == 0) {
            // Even - Question 2
            return "SELECT * FROM employees WHERE department = 'IT' AND salary > 50000;"; // Replace with actual Query 2
        } else {
            // Odd - Question 1
            return "SELECT * FROM customers WHERE age > 30 AND country = 'USA';"; // Replace with actual Query 1
        }
    }
}