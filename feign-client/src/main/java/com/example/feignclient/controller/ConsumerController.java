package com.example.feignclient.controller;

import com.example.feignclient.clients.RemoteCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

@RestController
public class ConsumerController {

    @Autowired
    private RemoteCallService client;

    @GetMapping("/consumer")
    public ResponseEntity<String> getFromFirstService() throws RestClientException, IOException {


        String message = client.getData();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


}
