package com.example.backend_account_db.repositories;

import com.example.backend_account_db.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String>{
}
