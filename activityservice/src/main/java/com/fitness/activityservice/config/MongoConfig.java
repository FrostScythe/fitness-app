package com.fitness.activityservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing //Spring automatically sets these fields when you save/update a MongoDB document.
public class MongoConfig {
    // will add custom MongoDB configurations if needed in the future
}