package com.miguel.payment.paymentapi.controllers;
import com.miguel.payment.paymentapi.services.TransactionService;
import dto.PaymentRequestDTO;
import dto.StatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/payment")
    public ResponseEntity<StatusDTO> processPayment(@RequestBody PaymentRequestDTO paymentRequest) {
        StatusDTO status = transactionService.processPaymentRequest(paymentRequest);
        String message;

        if (status.getStatus().equals("AUTORIZADO")) {
            message = "Pagamento autorizado";
        } else {
            message = "Pagamento negado";
        }

        status.setMessage(message);

        return ResponseEntity.ok(status);
    }
}
