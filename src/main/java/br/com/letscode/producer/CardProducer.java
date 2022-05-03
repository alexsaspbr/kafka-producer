package br.com.letscode.producer;

import br.com.letscode.domain.CardDTO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class CardProducer {

    @Value("${topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(CardDTO card){
        Gson gson = new Gson();
        String message = gson.toJson(card);
        kafkaTemplate.send(topic, message);
    }

}
