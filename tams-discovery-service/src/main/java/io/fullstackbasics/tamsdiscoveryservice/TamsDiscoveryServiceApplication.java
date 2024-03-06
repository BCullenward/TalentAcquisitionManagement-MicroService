package io.fullstackbasics.tamsdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TamsDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TamsDiscoveryServiceApplication.class, args);
	}

}
