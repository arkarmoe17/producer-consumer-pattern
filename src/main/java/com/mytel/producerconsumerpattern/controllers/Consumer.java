package com.mytel.producerconsumerpattern.controllers;

import com.mytel.producerconsumerpattern.entity.Message;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class Consumer{

    public void consume(BlockingQueue<String> sharedQueue){
        try {

            String consumedList = sharedQueue.take();
            System.out.println("consumed lists :{}"+consumedList);
            if(sharedQueue.isEmpty()){
                System.out.println("now queue is empty.");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consumeMessage(BlockingQueue<Message> sharedQueue){
        try {

            Message message = sharedQueue.take();
            System.out.println("message :{}"+message.toString());
            if(sharedQueue.isEmpty()){
                System.out.println("now message queue is empty.");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
