package br.com.aab.springboot.openfeign.client.account.balance;

import br.com.aab.springboot.openfeign.domain.AccountBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountBalanceClientController {

    @Autowired
    AvailableAccountBalanceClient availableAccountBalanceClient;

    @GetMapping(value = "/openfeign-get-account-balance")
    public ResponseEntity<AccountBalance> getAccountBalance() {
        return ResponseEntity.ok(availableAccountBalanceClient.getAccountBalance());
    }
}
