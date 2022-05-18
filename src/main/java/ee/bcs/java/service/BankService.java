package ee.bcs.java.service;

import ee.bcs.java.repository.AccountRepository;
import ee.bcs.java.repository.ControllerRepository;
import ee.bcs.java.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BankService {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransferRepository transferRepository;
    @Autowired
    private ControllerRepository controllerRepository;

    public void createBankAccount(String acc_nr) {
        accountRepository.createBankAccount(acc_nr);
    }
    public double getBalance(String acc_nr) {
        return accountRepository.getBalance(acc_nr);
    }
    public String depositMoney(String acc_nr, double amount) {
        if (amount < 0) {
            return "Kontole pandav summa ei saa olla negatiivne";
        }
        Double oldBalance = accountRepository.getBalance(acc_nr);

        Double newBalance = oldBalance + amount;
        accountRepository.updateBalance(acc_nr, newBalance);
        transferRepository.createTransfer(acc_nr, amount);

        return "Uus konto jääk on:" + newBalance;
    }

    public String withdrawMoney(String acc_nr, double amount) {
        if (amount < 0) {
            return "error";
        }
        Double oldBalance = accountRepository.getBalance(acc_nr);
        if (amount > oldBalance) {
            return "error";
        }
        Double newBalance = oldBalance - amount;
        accountRepository.updateBalance(acc_nr, newBalance);
        transferRepository.createTransfer(acc_nr, -amount);

        return "kontol on:" + newBalance;
    }

    public String transferMoney(String fromAccountNr, String toAccountNr, Double transferAmount) {
        if (transferAmount < 0) {
            return "error";
        }
        Double fromAccountOldBalance = accountRepository.getBalance(fromAccountNr);

        Double fromAccountNewBalance = fromAccountOldBalance - transferAmount;



        if (fromAccountNewBalance < 0) {
            return "error";
        }
        transferRepository.createTransfer(fromAccountNr, -transferAmount);
        accountRepository.updateBalance(fromAccountNr, fromAccountNewBalance);

        Double toAccountOldBalance = accountRepository.getBalance(toAccountNr);

        Double toAccountNewBalance = toAccountOldBalance + transferAmount;

        accountRepository.updateBalance(toAccountNr, toAccountNewBalance);
        transferRepository.createTransfer(toAccountNr, transferAmount);

        return "ok";
    }
    public List<Double> getHistory(String acc_nr){
        return controllerRepository.getHistory(acc_nr);

    }
}



