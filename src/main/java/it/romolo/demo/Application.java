package it.romolo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//@RequestMapping("/index")
	//    String home() {
	//        return "Hello World!";
	//    }
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("CIAO ROMOLO");


	}

}
