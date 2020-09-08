package com.manipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.manipal")
public class TemperatureCalculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureCalculationServiceApplication.class, args);
	}

}
