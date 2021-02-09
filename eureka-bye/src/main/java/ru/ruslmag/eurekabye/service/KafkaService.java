package ru.ruslmag.eurekabye.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    String count;

    @KafkaListener(topics = "hello_topic", groupId = "app-1")
    public void listener(String message) {
        count = message;
    }

    public String getCount() {
        return count;
    }
}
