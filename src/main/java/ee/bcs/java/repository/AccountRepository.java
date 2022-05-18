package ee.bcs.java.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void createBankAccount(String acc_nr) {
        String sql = "INSERT INTO bank (acc_nr, balance) VALUES (:acc_nr, :balance)";
        Map paraMap = new HashMap();
        paraMap.put("acc_nr", acc_nr);
        paraMap.put("balance", 0.0);
        jdbcTemplate.update(sql, paraMap);
    }

    public double getBalance(String acc_nr){
        String sql = "SELECT balance FROM bank WHERE acc_nr = :acc_nr";
        Map paraMap = new HashMap();
        paraMap.put("acc_nr" , acc_nr);
        Double balance = jdbcTemplate.queryForObject(sql, paraMap, Double.class);
        return balance;

    }
    public void updateBalance(String acc_nr,double amount){
        String sql2 = "UPDATE bank SET balance = :balance WHERE acc_nr= :acc_nr";
        Map paraMap2 = new HashMap();
        paraMap2.put("balance", amount);
        paraMap2.put("acc_nr",acc_nr);
        jdbcTemplate.update(sql2,paraMap2);

    }




}
