package com.kodat.of;

import com.kodat.of.entity.Wikimedia;
import com.kodat.of.entity.repository.WikimediaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private final WikimediaRepository wikimediaRepository;


    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    public KafkaDatabaseConsumer(WikimediaRepository wikimediaRepository) {
        this.wikimediaRepository = wikimediaRepository;
    }


    @KafkaListener(topics = "${spring.kafka.topic.name}" , groupId = "myGroup")
    public void consume(String eventMessage){

    LOGGER.info(String.format("Event message received  -> %s",eventMessage));

        Wikimedia wikimedia = new Wikimedia();
        wikimedia.setEventData(eventMessage);
        wikimediaRepository.save(wikimedia);

}

}
