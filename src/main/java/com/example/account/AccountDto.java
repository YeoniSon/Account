package com.example.account;

import lombok.*;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
//@NoArgsConstructor // 아무것도 없는 생성자
@AllArgsConstructor // 모든 프로퍼티를 가지고 있는 생성자
@RequiredArgsConstructor // 필수값을 가지게 하는 생성자 -> Bean들을 주입받는 생성자 일 경우 사용
//@Data //getter,setter,RequiredArgsConstructor, ToString 등이 다 들어 있음
// Data는 중요도가 떨어지거나 자주 사용하지 않음 -> 개인정보 유출을 피하기 위해
@Slf4j // log를 사용할 수 있도록 해줌
public class AccountDto {
    private String accountNumber;
    private String nickname;
    private LocalDateTime registeredAt;


    public void log(){
        log.error("error is occurred.");
    }
}
