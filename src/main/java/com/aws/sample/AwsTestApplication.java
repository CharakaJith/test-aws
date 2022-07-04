package com.aws.sample;

import com.aws.sample.Controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)
public class AwsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsTestApplication.class, args);
	}

}
