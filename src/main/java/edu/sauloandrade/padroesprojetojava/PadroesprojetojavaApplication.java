package edu.sauloandrade.padroesprojetojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller", "model", "repository", "service"})
public class PadroesprojetojavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesprojetojavaApplication.class, args);
	}

}
