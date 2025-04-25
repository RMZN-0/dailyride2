package com.dailyride2.dailyeverything;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com/dailyride2/dailyeverything/all")
public class DailyeverythingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyeverythingApplication.class, args);
	}

}
