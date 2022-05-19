package com.katakeynii.rabbitmqtest.rabbitmqtest;

import com.katakeynii.rabbitmqtest.rabbitmqtest.config.RabbitMQConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RabbitmqTestApplication {

	public static void main(String[] args) {
		// System.out.println(RabbitMQConfig.queueName);
		SpringApplication.run(RabbitmqTestApplication.class, args);
	}

}
