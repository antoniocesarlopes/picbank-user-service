package com.picbank.picbank_user_service;

import org.springframework.boot.SpringApplication;

public class TestPicbankUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(PicbankUserServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
