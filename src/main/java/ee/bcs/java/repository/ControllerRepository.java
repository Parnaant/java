package ee.bcs.java.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ControllerRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<Double> getHistory(String acc_nr){
        String sql = "SELECT amount FROM transfer WHERE acc_nr = :acc_nr";
        Map paramMap = new HashMap<>();
        paramMap.put("acc_nr", acc_nr);
        List<Double> amount = jdbcTemplate.queryForList(sql, paramMap, Double.class);
        return amount;
    }
}
