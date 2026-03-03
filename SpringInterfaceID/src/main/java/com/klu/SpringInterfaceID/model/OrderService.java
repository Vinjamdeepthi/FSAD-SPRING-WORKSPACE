package com.klu.SpringInterfaceID.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.klu.SpringInterfaceID.service.PaymentService;

@Component
public class OrderService {
  
  private PaymentService paymentService;

    //  Interface DI using Constructor

    @Autowired
    public OrderService(@Qualifier("upiPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder() {
        paymentService.pay();
    }


}