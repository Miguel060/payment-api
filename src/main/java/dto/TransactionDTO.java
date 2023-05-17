package dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class TransactionDTO {
    private Long id;

    private StatusDTO status;

    @JsonProperty ("cartao")
    private String cardNumber;

    @JsonProperty ("estabelecimento")
    private String establishment;

    @JsonProperty ("descricao")
    private String description;

    @JsonProperty ("valor")
    private Double value;

    @JsonProperty ("dataHora")
    private LocalDateTime dateHour;

    @JsonProperty ("parcelas")
    private Integer installments;

    @JsonProperty ("formaPagamento")
    private String formOfPayment;
}