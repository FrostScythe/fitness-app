package com.fitness.activityservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * WebClient configuration for inter-service communication
 * Currently disabled as user validation is not part of the tutorial architecture
 */
@Configuration
public class WebClientConfig {

    // Commented out - not needed for tutorial implementation
    // User validation should be handled differently if needed in production

    /*
    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    public WebClient userServiceWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .baseUrl("http://USERSERVICE")
                .build();
    }
    */
}
