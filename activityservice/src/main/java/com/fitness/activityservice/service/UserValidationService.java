package com.fitness.activityservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserValidationService {

     private final WebClient userServiceWebClient;

    public boolean validateUser(String userId) {
        log.info("Calling User Service to validate user ID: {}", userId);
        try {
            Boolean result = userServiceWebClient.get()
                    .uri("/api/users/{id}/validate", userId)
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    //A Mono is a reactive container that will give you a value later.
                    //It is like a box that promises:
                    //“I will give you a Boolean when the response arrives.”
                    .block();
            //Wait for Mono → return actual Boolean immediately
            return Boolean.TRUE.equals(result);
        } catch (WebClientResponseException e) {
            e.printStackTrace();
            return false;
        }
    }
}