package br.com.letscode.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class CardDTO {

    private String pan;
    private String name;
    private Brand brand;

}
