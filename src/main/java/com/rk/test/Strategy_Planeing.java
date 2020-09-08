package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.beans.FlipKart;

public class Strategy_Planeing {

	public static void main(String[] args) {
		
		//read inputs
		ApplicationContext ctx=null;
		FlipKart fpkt=null;
		
		//create IOC container
		ctx= new ClassPathXmlApplicationContext("com/rk/cfgs/application-context.xml");
		
		//get beans
		fpkt=ctx.getBean("fkrt",FlipKart.class);
		
		//invoke the method
		System.out.println(fpkt.shopping(new String[] {"pepet","mask","globs"},new float[] {100,200,20}));
		
		//close Container
		((AbstractApplicationContext) ctx).close();
		
}//main
}//class