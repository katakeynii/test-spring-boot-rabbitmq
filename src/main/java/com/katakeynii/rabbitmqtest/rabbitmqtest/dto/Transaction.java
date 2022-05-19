package com.katakeynii.rabbitmqtest.rabbitmqtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Transaction {
    
    private String id;
    private Double amount;

    public String toString() {
        return "UUID : "+ id +" ||| amount : " + getAmount() ;
    }
}
