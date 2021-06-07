package com.learning.btm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.btm.controller.BTMLogsController;

@SpringBootApplication
public class DummyLogsGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyLogsGeneratorApplication.class, args);
		@SuppressWarnings("unused")
		BTMLogsController btmLogsController = new BTMLogsController();
	}

}
