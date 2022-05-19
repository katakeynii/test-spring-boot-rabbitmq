
package com.katakeynii.rabbitmqtest.rabbitmqtest.consumers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Service
public class TransactionConsumer{

  @RabbitListener(queues = {"${free.broker.rabbitmq.queueName}"})
  public void listen(String transaction) {
      System.out.println("================================================");
      System.out.println(transaction);

      System.out.println("Enregistrement de la transaction");
      System.out.println("Récuperation des plans");
      System.out.println("Récuperation de l'aborescente");
      System.out.println("Calcul de la commission");
      System.out.println("Pusblish le resultat");
  }
}

