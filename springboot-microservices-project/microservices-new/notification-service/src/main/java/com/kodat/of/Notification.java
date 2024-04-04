package com.kodat.of;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class Notification {
    public static void main(String[] args) {

        SpringApplication.run(Notification.class);
    }

    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(OrderPlacedEvent orderPlacedEvent){

        log.info("Received notification for order - {}" , orderPlacedEvent.getOrderNumber());

    }
}