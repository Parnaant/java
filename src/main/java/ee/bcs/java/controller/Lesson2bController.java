package ee.bcs.java.controller;

import ee.bcs.java.tasks.Lesson2b;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson2bController {

    @PostMapping("lesson2b/reverseArray")
    public int[] reverseArray(@RequestBody int[] input) {
        return Lesson2b.reverseArray(input);
    }


    @PostMapping("lesson2b/evenNumbers")
    public int[] evenNumbers(@RequestBody int input) {
        return Lesson2b.evenNumbers(input);
    }


}
