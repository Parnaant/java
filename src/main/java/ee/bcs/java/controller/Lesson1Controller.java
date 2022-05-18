package ee.bcs.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson1Controller {

    @GetMapping("hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("lesson1/min/{a}/{b}")
    public int min(@PathVariable("a") int a, @PathVariable("b") int b) {
        if (a < b) {
            return a;

        } else {
            return b;
        }
    }

    @GetMapping("lesson1/max/{a}/{b}")
    public static int max(@PathVariable("a") int a, @PathVariable("b") int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    @GetMapping("lesson1/abs/{a}")
    public static int abs(@PathVariable("a") int a) {
        if (a < 0) {
            return (a * -1);
        } else {
            return a;
        }
    }

    @GetMapping("lesson1/isEven/{a}")
    public static boolean isEven(@PathVariable("a") int a) {
        if (a % 2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @GetMapping("lesson1/min3/{a}/{b}/{c}")
    public static int min3(@PathVariable("a") int a, @PathVariable("b") int b, @PathVariable("c") int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    @GetMapping("lesson1/max3/{a}/{b}/{c}")
    public static int max3(@PathVariable("a") int a, @PathVariable("b") int b, @PathVariable("c") int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    @GetMapping("lesson1/someString")
    public static String someString() {
        return "\"\\\"\\\\\"\"";

    }
}
