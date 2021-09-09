package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/config_collection.xml");

		Emp emp1 = (Emp) context.getBean("Emp1");

		System.out.println(emp1);
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
	}
}
