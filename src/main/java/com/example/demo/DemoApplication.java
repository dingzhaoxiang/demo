package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@org.springframework.boot.autoconfigure.SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException{
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);

		HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
				.getBean("helloSyncServiceReference");

		System.out.println(helloSyncServiceReference.saySync("sync"));
	}
}
