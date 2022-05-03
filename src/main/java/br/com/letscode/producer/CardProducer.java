package br.com.letscode.producer;

import br.com.letscode.domain.CardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CardProducer {

    @Value("${topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(CardDTO card){
        kafkaTemplate.send(topic, card);
    }

}
