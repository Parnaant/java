package ee.bcs.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonCController {


    @GetMapping("lessonC/testStuff/{a}/{b}/{c}/{d}/{e}/{f}/{g}")
    public static int testStuff(@PathVariable("a") int a,@PathVariable("b") int b,@PathVariable("c") int c,@PathVariable("d") int d,@PathVariable("e") int e,@PathVariable("f") int f,@PathVariable("g") int g){
        int count = 0;
        if (a % 2 == 0) {
            count= count + 1;
        }
        if (b % 2 == 0) {
            count= count + 1;
        }
        if (c % 2 == 0) {
            count= count + 1;
        }
        if (d % 2 == 0) {
            count= count + 1;
        }
        if (e % 2 == 0) {
            count= count + 1;
        }
        if (f % 2 == 0) {
            count= count + 1;
        }
        if (g % 2 == 0) {
            count= count + 1;
        }
            return count;


    }
}
