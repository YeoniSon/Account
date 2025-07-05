package com.example.account.repository;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //Bean으로 등록하기 위해
public interface AccountRepository extends JpaRepository<Account, Long> {
//jpaRepository를 이용하여 값을 가져오는 것

    Optional<Account> findFirstByOrderByIdDesc();

    Integer countByAccountUser(AccountUser accountUser); // accountUser가 여러개를 받을 수 있어서 가능

}
