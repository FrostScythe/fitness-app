package com.fitness.aiservice.service;


import com.fitness.aiservice.model.Activity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "activity-processor-group"
    )
    public void processActity(Activity activity){
        log.info("Received activity for processing: {}", activity.getUserId());
        log.warn(">>> Kafka message received in AiService");
        log.warn(">>> Activity UserId: {}", activity.getUserId());
        log.warn(">>> Full Activity: {}", activity);
        // Further processing logic can be added here
    };
}