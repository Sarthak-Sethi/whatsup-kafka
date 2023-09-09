package com.kafka.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {


    @KafkaListener(topics = "KAFKA-TOPIC",groupId = "1")
    public void updatedLocation(String value) {
        System.out.println(value);

    }

}
