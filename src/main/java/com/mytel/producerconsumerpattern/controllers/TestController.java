package com.mytel.producerconsumerpattern.controllers;

import com.mytel.producerconsumerpattern.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producer")
public class TestController {

    @Autowired
    private Producer producer;

    @PostMapping("/produce")
    public void sendStringList(@RequestBody List<String> strings){
        //put to queue
        producer.putToQueue(strings);
    }

    @PostMapping("/message")
    public String sendMessage(@RequestBody Message message){
        return producer.putToMessageQueue(message);
    }
}
