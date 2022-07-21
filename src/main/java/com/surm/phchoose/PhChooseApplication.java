package com.surm.phchoose;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.surm.phchoose.dao")
public class PhChooseApplication {

	public static void main(String[] args) {

		SpringApplication.run(PhChooseApplication.class, args);
	}

}
