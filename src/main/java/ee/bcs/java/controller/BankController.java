package ee.bcs.java.controller;

import ee.bcs.java.repository.ControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;
import ee.bcs.java.service.BankService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BankController {


    @Autowired
    private BankService bankService;


    // TODO 1
    @PostMapping("bank/account/{acc_nr}")
    public void createAccount(@PathVariable("acc_nr") String acc_nr) {
        bankService.createBankAccount(acc_nr);
    }

    // TODO 2
    @GetMapping("bank/account/{acc_nr}")
    public Double getBalance(@PathVariable("acc_nr") String acc_nr) {
        return bankService.getBalance(acc_nr);
    }

    // TODO 3
    @PutMapping("bank/account/deposit/{acc_nr}/{amount}")
    public String depositMoney(@PathVariable String acc_nr, @PathVariable Double amount) {
        return bankService.depositMoney(acc_nr,amount);
    }

    // TODO 4
    @PutMapping("bank/account/withdraw/{acc_nr}/{amount}")
    public String withdrawMoney(@PathVariable String acc_nr, @PathVariable Double amount) {
        return  bankService.withdrawMoney(acc_nr,amount);
    }

    // TODO 5
    @PutMapping("bank/account/transfer/{fromAccountNr}/{toAccountNr}/{amount}")
    public String transferMoney(@PathVariable String fromAccountNr, @PathVariable String toAccountNr, @PathVariable Double amount) {
        return  bankService.transferMoney(fromAccountNr,toAccountNr,amount);
    }
    @PutMapping("bank/account/history/{acc_nr}")
    public List<Double> getHistory(@PathVariable ("acc_nr")String acc_nr){
        return bankService.getHistory(acc_nr);
    }




}
