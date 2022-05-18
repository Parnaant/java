package ee.bcs.java.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository

public class TransferRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void createTransfer(String acc_nr, double amount){
        String sql = "INSERT INTO transfer (acc_nr, amount) VALUES (:acc_nr, :amount )";
        Map paramMap = new HashMap<>();
        paramMap.put("acc_nr",acc_nr);
        paramMap.put("amount", amount);
        jdbcTemplate.update(sql, paramMap);
    }
}
