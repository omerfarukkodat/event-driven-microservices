package com.kodat.of.emailservice.kafka;

import com.kodat.of.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailConsumer.class);

@KafkaListener(topics = "${spring.kafka.topic.name}" , groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event){

    LOGGER.info(String.format("Order event received in email service => %s" , event.toString()));

        //send an email to the consumer
    }


}
