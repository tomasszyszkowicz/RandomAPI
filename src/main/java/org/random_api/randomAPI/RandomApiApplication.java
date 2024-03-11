package org.random_api.randomAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "org.random_api.randomAPI")
public class RandomApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomApiApplication.class, args);
	}

}
