package unit2.yr2011;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Write a program for thread using runnable interface for producer-consumer
 * relationship.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class ProducerConsumerProblem {

	public static void main(String args[]) {

		// Message Queue that contains messages produced by Producer
		Queue messageQueue = new LinkedList();

		// Create producer and pass Message Queue to Produce
		Producer producer = new Producer(messageQueue);

		// Create consumer and pass Message Queue to consume
		Consumer consumer = new Consumer(messageQueue);

	}

}

// Producer that add messages in Queue
class Producer implements Runnable {

	Queue messageQueue = null;

	// Constructor received queue and start thread
	public Producer(Queue mq) {
		messageQueue = mq;
		Thread producer = new Thread(this);
		producer.start();
	}

	public void run() {

		int i = 1;
		while (true) {
			// Add message to queue
			messageQueue.offer("Producer # " + i);
			i++;
		}
	}
}

// Consumer consumes messages from queue
class Consumer implements Runnable {

	Queue messageQueue = null;

	// Constructor received queue and start thread
	public Consumer(Queue mq) {
		messageQueue = mq;
		Thread consumer = new Thread(this);
		consumer.start();
	}

	public void run() {
		while (true) {
			// Remove a message from Queue and consume
			Object object = messageQueue.poll();
			System.out.println("Consumed : " + object);
		}
	}
}