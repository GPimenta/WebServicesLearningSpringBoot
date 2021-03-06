package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		ConfigurableApplicationContext aplicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = aplicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearh(new int[] {12,4,6}, 3);
		System.out.println(result);




	}

}
