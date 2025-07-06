package com.example.account.repository;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import com.example.account.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //Bean으로 등록하기 위해
public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {
//jpaRepository를 이용하여 값을 가져오는 것


}
