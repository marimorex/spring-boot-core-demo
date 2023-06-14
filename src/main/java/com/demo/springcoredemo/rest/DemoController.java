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
    private Coach myAnotherCoach;

    /*
    CONSTRUCTOR INJECTION
    // define a constructor for dependency injection
    */
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach,
                          @Qualifier("baseballCoach") Coach theAnotherCoach){
        System.out.println("In Constructor: " + getClass().getName());
        this.myCoach = theCoach;
        this.myAnotherCoach = theAnotherCoach;
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

    @GetMapping("/check")
    public String check(){
        return "Comparing Beansaa mycoach == anothercoach , " + (myCoach==myAnotherCoach);
    }
}

