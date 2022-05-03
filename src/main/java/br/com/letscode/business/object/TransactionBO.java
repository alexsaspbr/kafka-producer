package br.com.letscode.business.object;

import br.com.letscode.domain.Transaction;
import br.com.letscode.producer.TransactionProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionBO {

    @Autowired
    private TransactionProducer transactionProducer;

    public Transaction createTransaction(Transaction transaction){
        transactionProducer.send(transaction);
        return transaction;
    }

}
