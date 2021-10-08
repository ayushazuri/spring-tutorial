package com.springcore.autowire.ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/ann/awconfig.xml");

		Emp emp = context.getBean("emp", Emp.class); // Other way of typecasting in this case
		System.out.println(emp);
	}
}
