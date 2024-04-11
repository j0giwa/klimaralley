package de.thowl.klimaralley.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication // Commented in case SecurityAutoConfiguration causes problems
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
public class KlimaralleyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KlimaralleyServerApplication.class, args);
	}

}
