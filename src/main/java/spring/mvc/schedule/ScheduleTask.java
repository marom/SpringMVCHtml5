package spring.mvc.schedule;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * Created by maro on 10/05/16.
 */
public class ScheduleTask {

    @Scheduled(fixedDelay = 10000)
    public void fixedDelaySchedule() {
        System.out.println("ScheduleTask fixedDelaySchedule every 10 sec:" + new Date());
    }

    @Scheduled(cron = "0/30 * * * * ?")
    public void cronSchedule() {
        System.out.println("ScheduleTask cronSchedule every 30 sec:" + new Date());
    }

}
