package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;

    /*
    CONSTRUCTOR INJECTION
    // define a constructor for dependency injection
    */
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach){
        System.out.println("In Constructor: " + getClass().getName());
        myCoach = theCoach;
    }

    /*
    SETTER INJECTION

    @Autowired
    public void setCoach(Coach theCoach) {
        this.myCoach = theCoach;
    }
    */
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
