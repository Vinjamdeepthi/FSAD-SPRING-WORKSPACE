package com.klu.SpringInterfaceID.model;


import org.springframework.stereotype.Component;


import com.klu.SpringInterfaceID.service.PaymentService;

@Component("upipayment")
public class UpiPayment  implements PaymentService{
	@Override
	  public void pay() {
	    // TODO Auto-generated method stub
	    System.out.println("Payment done using UPI");
	    
	  }

	}

