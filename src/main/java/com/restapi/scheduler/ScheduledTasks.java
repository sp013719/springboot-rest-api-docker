package com.restapi.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledTasks {

     @Scheduled(fixedRate = 5000)
     public void reportCurrentTime() {
         System.out.println("Current Time: " + new Date());
     }
}
