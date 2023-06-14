package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.Clock;

@Component
//@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
}
