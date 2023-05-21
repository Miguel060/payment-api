package com.miguel.payment.paymentapi.controllers;

import com.miguel.payment.paymentapi.services.TransactionService;
import dto.PaymentRequestDTO;
import dto.StatusDTO;
import dto.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<StatusDTO> processPayment(@RequestBody PaymentRequestDTO paymentRequest) {
        StatusDTO status = transactionService.processPaymentRequest(paymentRequest);

        String message;
        if (status.getStatus().equals("NEGADO")) {
            message = "Pagamento negado";
        } else {
            message = "Pagamento autorizado";
        }

        status.setMessage(message);

        return ResponseEntity.ok(status);
    }

}
