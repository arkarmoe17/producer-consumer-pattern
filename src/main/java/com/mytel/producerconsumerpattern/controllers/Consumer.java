package com.mytel.producerconsumerpattern.controllers;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Consumer /*implements Runnable*/ {

    public void consume(BlockingQueue<String> sharedQueue){
        try {

            String consumedList = sharedQueue.take();
            System.out.println("consumed lists :{}"+consumedList);
            if(sharedQueue.isEmpty()){
                System.out.println("now queue is empty.");
            }
            /*for(String s :consumedList){
                System.out.print(s);
            }*/
//            return consumedList;
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
        }
//        return null;
    }



    /*@Override
    public void run() {
        while(true){
            try {
                System.out.println(" Consumed: "+ sharedQueue.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
}
