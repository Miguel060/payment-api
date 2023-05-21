package com.miguel.payment.paymentapi.services;

import dto.PaymentRequestDTO;
import dto.StatusDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Data
public class TransactionService {
    public StatusDTO processPaymentRequest(PaymentRequestDTO paymentRequest) {
        String cardNumber = paymentRequest.getCardNumber();
        String establishment = paymentRequest.getEstablishment();
        String description = paymentRequest.getDescription();
        String formOfPayment = paymentRequest.getFormOfPayment();
        Integer installments = paymentRequest.getInstallments();
        Double value = paymentRequest.getValue();
String statusValue;
        if (cardNumber != null && cardNumber.length() !=16) {
            statusValue = "NEGADO";
        } else {
            statusValue = "AUTORIZADO";
        }
        return new StatusDTO(statusValue, null);
    }

}
