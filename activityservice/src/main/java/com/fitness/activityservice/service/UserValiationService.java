package com.fitness.activityservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

/**
 * UserValidationService - Currently disabled
 * This service is not part of the tutorial architecture
 * User validation should be handled at the API Gateway level in production
 */
// @Service - Commented out to disable this service
@RequiredArgsConstructor
public class UserValiationService {
    // private final WebClient userServiceWebClient;

    /*
    public boolean validateUser(String userId) {
        try {
            Boolean result = userServiceWebClient.get()
                    .uri("/api/users/{id}/validate", userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block();
            return Boolean.TRUE.equals(result);
        } catch (WebClientResponseException e) {
            e.printStackTrace();
            return false;
        }
    }
    */
}
