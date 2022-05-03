package br.com.letscode.controller;

import br.com.letscode.business.object.TransactionBO;
import br.com.letscode.domain.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionBO transactionBO;

    @PostMapping("/transaction")
    public ResponseEntity<Transaction> create(@RequestBody Transaction transaction) {
        return ResponseEntity.ok(transactionBO.createTransaction(transaction));
    }

}
