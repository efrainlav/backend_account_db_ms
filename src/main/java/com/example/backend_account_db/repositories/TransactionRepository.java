package com.example.backend_account_db.repositories;

import com.example.backend_account_db.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TransactionRepository extends MongoRepository <Transaction, String>{
    List<Transaction> findByusernameOrigin(String usernameOrigin)

}
