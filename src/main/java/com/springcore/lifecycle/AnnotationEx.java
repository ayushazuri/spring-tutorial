package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationEx {
	private String example;

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "AnnotationEx [example=" + example + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Inside init an");
	}

	@PreDestroy
	public void end() {
		System.out.println("Inside destroy an");
	}
}
