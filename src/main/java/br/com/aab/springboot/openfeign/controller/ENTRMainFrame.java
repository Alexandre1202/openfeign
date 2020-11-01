package br.com.aab.springboot.openfeign.controller;

import br.com.aab.springboot.openfeign.domain.AccountBalance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ENTRMainFrame {

    @GetMapping(value = "available-account-balance")
    public AccountBalance getAvailableAccountBalance() {
        return new AccountBalance("Barak Obama", 912380508.47D);
    }
}
