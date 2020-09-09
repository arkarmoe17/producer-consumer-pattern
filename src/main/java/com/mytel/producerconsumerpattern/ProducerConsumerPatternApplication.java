package com.mytel.producerconsumerpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerConsumerPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerConsumerPatternApplication.class, args);

		/*//Creating shared object
		BlockingQueue sharedQueue = new LinkedBlockingQueue();

//Creating Producer and Consumer Thread
		Thread prodThread = new Thread(new Producer(sharedQueue));
		Thread consThread = new Thread(new Consumer(sharedQueue));

//Starting producer and Consumer thread
		prodThread.start();
		consThread.start();*/
	}

}
