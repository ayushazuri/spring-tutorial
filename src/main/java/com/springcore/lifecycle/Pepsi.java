package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception { // init through initializingBean.
		// TODO Auto-generated method stub
		System.out.println("Init");
	}

	public void destroy() throws Exception { // through disposableBean
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}
}
