package com.katakeynii.rabbitmqtest.rabbitmqtest.config;

import com.katakeynii.rabbitmqtest.rabbitmqtest.Receiver;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${free.broker.rabbitmq.queueName}")
    public String queueName;

    @Value("${free.broker.rabbitmq.directExchangeName}")
    public String directExchangeName;

    @Bean
    Queue queue() {
      return new Queue(queueName, false);
    }
    @Bean
    public ApplicationRunner runner(AmqpTemplate template) {
        return args -> template.convertAndSend(queueName, "foo");
    }
    @Bean
    DirectExchange exchange() {
      return new DirectExchange(directExchangeName);
    }

    @Bean
    Binding binding(Queue queue, DirectExchange exchange) {
      return BindingBuilder.bind(queue).to(exchange).with(directExchangeName);
    }
}
