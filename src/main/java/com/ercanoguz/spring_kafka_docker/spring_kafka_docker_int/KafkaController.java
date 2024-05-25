package com.ercanoguz.spring_kafka_docker.spring_kafka_docker_int;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaController {

    private final com.ercanoguz.spring_kafka_docker.spring_kafka_docker_int.KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void writeMessageTopic(@RequestParam("message") String message) {
        this.producer.writeMessage(message);
    }
}
