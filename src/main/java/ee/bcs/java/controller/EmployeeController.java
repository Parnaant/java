package ee.bcs.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    // 1) kuva kõigi töötajate nimed
    //GET : localhost:8080/employee
    @GetMapping("employee")
    public List<String> getAllEmployees() {
        return null;
    }

    // 2) kuva 1 töötaja nimi
    //GET: localhost:8080/employee/1
    @GetMapping("employee/{n}")
    public String getEmployee(@PathVariable("n") int n) {
        String sql ="SELECT first_name FROM employee WHERE id = :n";
        Map paraMap = new HashMap();
        paraMap.put("n" , n);
        String result = jdbcTemplate.queryForObject(sql, paraMap, String.class);
        return result;
    }


    // 3) Salvesta 1 töötaja
    //POST: localhost:8080/employee
    //RequestBody (töötaja nimi)
    @PostMapping("employee")
    public void saveEmployee(@RequestBody String employeeName) {
        String sql = "INSERT INTO employee (first_name) VALUES (:firstName)";
        Map paraMap = new HashMap();
        paraMap.put("firstName", employeeName);
        jdbcTemplate.update(sql, paraMap);

    }

    // 4) Muuda 1 töötajate nime
    //PUT : localhost:8080/employee/1
    //employeeList.set(0, "uus väärtus");
    @PutMapping("employee/{n}")
    public void putEmployee(@PathVariable("n") int n, @RequestBody String employeeName) {
        String sql = "UPDATE employee SET first_name = :firstName WHERE id = :n";
        Map paraMap = new HashMap();
        paraMap.put("firstName", employeeName);
        paraMap.put("n",n);
        jdbcTemplate.update(sql, paraMap);


    }


    // 5)Kustuta 1 töötaja
    //DELETE: localhost:8080/employee/1
    //employeeList.remove(1);
    @DeleteMapping("employee/{n}")
    public void deleteEmployee(@PathVariable("n") int n) {
        String sql = "DELETE FROM employee WHERE id = :n";
        Map paraMap = new HashMap();
        paraMap.put("n" ,n);
        jdbcTemplate.update(sql, paraMap);

    }

}
