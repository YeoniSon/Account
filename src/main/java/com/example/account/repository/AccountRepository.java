package com.example.account.repository;

import com.example.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Bean으로 등록하기 위해
public interface AccountRepository extends JpaRepository<Account, Long> {

}
