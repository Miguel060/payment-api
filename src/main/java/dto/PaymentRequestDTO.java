package dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class PaymentRequestDTO {

    private String cardNumber;
    private String establishment;
    private String description;


}
