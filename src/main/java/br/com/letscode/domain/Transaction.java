package br.com.letscode.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {

    private String description;
    private String pan;
    private Client client;
    private Brand brand;
    private BigDecimal amount;
    private LocalDateTime timestamp;

}
