package com.mytel.producerconsumerpattern.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


@Component
public class Producer /*implements Runnable */{
    private BlockingQueue<String> sharedQueue = new LinkedBlockingQueue();

    @Autowired
    private Consumer consumer;

    /*public Producer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }*/

    public void putToQueue(List<String> stringList){
        System.out.println("String List:{}"+stringList.toString());
        for(String s:stringList){
            sharedQueue.add(s);
            consumer.consume(sharedQueue);
        }

    }

    /*@Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Produced: "+ i);
                sharedQueue.put(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
}
