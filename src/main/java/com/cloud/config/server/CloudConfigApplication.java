package com.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
/*
 * Establishes as Central cloud Server to read properties from git hub
 * @Here : motive is the set external file in git hub and only changes will be done on git hub
 * instead of application code base properties set up and mustn't impact other dependand services.
 * Just changes in git 
 * hub and push there server will fetch it up from repo.
 */
public class CloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
	}

}
