package com.ercanoguz.spring_kafka_docker.spring_kafka_docker_int;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import  org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final String TOPIC= "my_Topic";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void writeMessage(String msg){
        this.kafkaTemplate.send(TOPIC,msg);
    }

}
