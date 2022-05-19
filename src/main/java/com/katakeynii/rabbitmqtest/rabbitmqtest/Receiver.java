package com.katakeynii.rabbitmqtest.rabbitmqtest;

import java.util.concurrent.CountDownLatch;

import com.katakeynii.rabbitmqtest.rabbitmqtest.dto.Transaction;

import org.springframework.stereotype.Component;

@Component
public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String transaction) {
        System.out.println("Received <" + transaction + ">");
        latch.countDown();
      }
    
//   public void receiveMessage(Transaction transaction) {
//     System.out.println("Received <" + transaction.toString() + ">");
//     latch.countDown();
//   }

  public CountDownLatch getLatch() {
    return latch;
  }
}
