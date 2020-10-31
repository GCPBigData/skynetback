package br.skynet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"br.skynet"})
@SpringBootApplication
public class SkyNetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyNetApplication.class, args);
	}
}
