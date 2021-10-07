package pl.triggerpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TriggerPpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TriggerPpApplication.class, args);
    }

}
