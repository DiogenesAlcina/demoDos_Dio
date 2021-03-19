package com.example.demoDos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	Usamos @SpringBootApplication
		 @Configuration, @EnableAutoConfigurationy y @ComponentScan
 */
@SpringBootApplication
public class DemoDosApplication {
	/*
		Método Main de la aplicación.
	*/
	public static void main(String[] args) {
		SpringApplication.run(DemoDosApplication.class, args);
		
		System.out.println("Hola_Mundo");
		System.out.println("¡Empecemos a programar!");
	}

}
