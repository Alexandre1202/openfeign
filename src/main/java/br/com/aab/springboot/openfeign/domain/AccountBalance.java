package br.com.aab.springboot.openfeign.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountBalance {
    private String customerName;
    private Long balance;
}
