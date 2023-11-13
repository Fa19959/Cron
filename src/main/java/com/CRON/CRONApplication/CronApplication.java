package com.CRON.CRONApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //It indicates that the application contains scheduling functionality
// and should be considered as a candidate for processing @Scheduled annotations.
public class CronApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronApplication.class, args);
	}

}
