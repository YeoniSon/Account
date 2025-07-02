package com.example.account.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // 객체 생성
@Entity //설정이라고 생각하면 됨
public class Account {
    @Id
    @GeneratedValue
    private Long id; //pk

    private String accountNumber;

    @Enumerated(EnumType.STRING) //0 1,2,3이 아니라 값을 지정한 것으로 알수 있음
    private AccountStatus accountStatus;

}
