package ee.bcs.java.controller;

import ee.bcs.java.tasks.Lesson2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson2Controller {

    @GetMapping("lesson2/generateArray")
    public int[] generateArray(@RequestParam("n") int n) {
        return Lesson2.generateArray(n);
    }
    @GetMapping("lesson2/decreasingArray")
    public int[] decreasingArray(@RequestParam("n") int n){
        return Lesson2.decreasingArray(n);

    }


}
