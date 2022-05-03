package br.com.letscode;

import br.com.letscode.domain.Brand;
import br.com.letscode.domain.CardDTO;
import br.com.letscode.producer.CardProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

import javax.annotation.PostConstruct;

@EnableKafka
@SpringBootApplication
public class KafkaProducerApplication {

    @Autowired
    private CardProducer cardProducer;

    @PostConstruct
    public void init() {
        CardDTO card = CardDTO.builder()
                              .pan("7845 **** **** 5698")
                              .name("Alex da Silva Araujo")
                              .brand(Brand.VISA)
                              .build();
        cardProducer.sendMessage(card);
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }

}