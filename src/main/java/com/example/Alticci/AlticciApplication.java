package com.example.Alticci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableCaching
@EnableSwagger2
public class AlticciApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlticciApplication.class, args);
	}

}
