package com.kakfa.producer.controlller;

import lombok.AllArgsConstructor;
import com.kakfa.producer.service.kafkaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class controller {

    kafkaService kafkaService;

    @GetMapping("/send")
    public void send(@RequestParam String message) {
        kafkaService.sendMessage(message);
    }
}
