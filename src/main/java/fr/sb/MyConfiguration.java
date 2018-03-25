package fr.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})// same as @Configuration
//@EnableAutoConfiguration @ComponentScan

@SpringBootApplication
public class MyConfiguration {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyConfiguration.class, args);
	}
	//mvn spring-boot:run
	//http://localhost:8080/
}

