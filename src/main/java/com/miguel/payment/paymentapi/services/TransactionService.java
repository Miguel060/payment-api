package com.miguel.payment.paymentapi.services;

import dto.PaymentRequestDTO;
import dto.StatusDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransactionService {
    public void processPaymentRequest(PaymentRequestDTO paymentRequest) {
        String cardNumber = paymentRequest.getCardNumber();
        String establishment = paymentRequest.getEstablishment();
        String description = paymentRequest.getDescription();
        String formOfPayment = paymentRequest.getFormOfPayment();
        Integer installments = paymentRequest.getInstallments();
        Double value = paymentRequest.getValue();

        if (cardNumber.length() < 16) {
            StatusDTO status = new StatusDTO("NEGADO");
        } else {
            StatusDTO status = new StatusDTO("AUTORIZADO");
        }


    }

}
