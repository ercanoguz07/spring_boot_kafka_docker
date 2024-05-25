package com.ercanoguz.spring_kafka_docker.spring_kafka_docker_int;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="my_Topic",groupId = "my_group_id")
    public void getMessage(String message){
        System.out.println(message);
    }
}
