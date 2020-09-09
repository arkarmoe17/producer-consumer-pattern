package com.mytel.producerconsumerpattern.controllers;

import com.mytel.producerconsumerpattern.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


@Service
public class Producer{
    private BlockingQueue<String> sharedQueue = new LinkedBlockingQueue();
    private BlockingQueue<Message> messageQueue = new LinkedBlockingQueue();

    @Autowired
    private Consumer consumer;

    public void putToQueue(List<String> stringList){
        System.out.println("String List:{}"+stringList.toString());
        for(String s:stringList){
            sharedQueue.add(s);
            consumer.consume(sharedQueue);
        }
    }

    public String putToMessageQueue(Message message){
        System.out.println("Add to message queue.");
        messageQueue.add(message);
        consumer.consumeMessage(messageQueue);
        return "Successful.";
    }
}
