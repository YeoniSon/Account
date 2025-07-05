package com.example.account.service;


import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import com.example.account.dto.AccountDto;
import com.example.account.exception.AccountException;
import com.example.account.repository.AccountRepository;
import com.example.account.repository.AccountUserRepository;
import com.example.account.type.ErrorCode;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.example.account.type.AccountStatus.IN_USE;

@Service
@RequiredArgsConstructor //꼭 필요한 argument를 생성하는 것
public class AccountService {
    private final AccountRepository accountRepository; // 무조건 생성자에 들어가야 하는 값
    private final AccountUserRepository accountUserRepository;

    /**
     * 사용자가 있는지 확인
     * 계좌의 번호를 생성하고
     * 계좌를 저자하고, 그 정보를 넘긴다.
     */
    @Transactional
    public AccountDto createAccount(Long userId, Long initialBalance) {
        AccountUser accountUser = accountUserRepository.findById(userId)
                .orElseThrow(() -> new AccountException(ErrorCode.USER_NOT_FOUND));

        validateCreateAccount(accountUser);

        String newAccountNumber = accountRepository.findFirstByOrderByIdDesc()
                .map(account -> (Integer.parseInt(account.getAccountNumber())) + 1 + "")
                .orElse("1000000000");

//        Account account = accountRepository.save(
//                Account.builder()
//                        .accountUser(accountUser)
//                        .accountStatus(IN_USE)
//                        .accountNumber(newAccountNumber)
//                        .balance(initialBalance)
//                        .registeredAt(LocalDateTime.now())
//                        .build()
//        );

        return AccountDto.fromEntity(
                accountRepository.save(Account.builder()
                        .accountUser(accountUser)
                        .accountStatus(IN_USE)
                        .accountNumber(newAccountNumber)
                        .balance(initialBalance)
                        .registeredAt(LocalDateTime.now())
                        .build())
        );


    }

    //option+command+m으로 빼둠
    private void validateCreateAccount(AccountUser accountUser) {
        if (accountRepository.countByAccountUser(accountUser) >= 10) {
            throw new AccountException(ErrorCode.MAX_ACCOUNT_PER_USER_10);
        }
    }

    @Transactional
    public Account getAccount(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Minus");
        }
        return accountRepository.findById(id).get();
    }
}
