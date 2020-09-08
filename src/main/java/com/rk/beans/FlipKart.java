package com.rk.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FlipKart {
	
	public FlipKart() {

		System.out.println("Flipkart 0 param cons");
	}
	
	//property
	@Autowired
	
	
	//@Qualifier("bDart")
	//@Qualifier("dtdc")
	private Courier courier;

	public void setCourier(Courier courier) {
		
		System.out.println("FlipKart.setCourier()");
		this.courier = courier;
	}

	//b.method
	public String shopping(String[]items,float[]price)
	{
		
		System.out.println("FlipKart.shopping()");
		
		float billamt=0.0f;
		int oid=0;
		String msg=null;
		
		//calculate bill amt
		for(float p:price)
		{
			billamt=billamt+p;
		}//for
		
		//generet order id randomly
		oid=new Random().nextInt(1000);
		
		//use courier id for delivering the product
		msg=courier.deliver(oid);
		
		//return courier details or order id return
		return Arrays.toString(items)+"are purchaes having prices "+Arrays.toString(price)+"bill amt is "+billamt+"---"+msg;
	
	}//method
}
