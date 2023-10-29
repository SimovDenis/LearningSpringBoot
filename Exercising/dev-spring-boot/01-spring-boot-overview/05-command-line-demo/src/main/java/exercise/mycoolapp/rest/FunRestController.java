/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Denis
 */
@RestController
public class FunRestController {

    @GetMapping("/")
    private String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    private String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    private String getDailyFortune() {
        return "Today is your lucky day.";
    }

    @GetMapping("/sunday")
    private String getSunday() {
        return "Today is sunday.";
    }


}
