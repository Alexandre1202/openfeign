package br.com.aab.springboot.openfeign.client.account.balance;

import br.com.aab.springboot.openfeign.domain.AccountBalance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "available-account-balance", url = "http://localhost:8080")
public interface AvailableAccountBalanceClient {
    @GetMapping(value = "available-account-balance")
    public AccountBalance getAccountBalance();
}
