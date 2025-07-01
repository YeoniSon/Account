package com.example.account.repository;

import com.example.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Bean으로 등록하기 위해
public interface AccountRepository extends JpaRepository<Account, Long> {
//jpaRepository를 이용하여 값을 가져오는 것
}
