package com.kakfa.producer.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class kafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("KAFKA-TOPIC",message);
    }

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name("KAFKA-TOPIC")
//                .partitions()
//                .replicas()
                .build();


    }

}
