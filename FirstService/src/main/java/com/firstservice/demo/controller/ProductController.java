package com.firstservice.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
@RequestMapping("/employee")
public class ProductController {

    @Value("${msg}")
    String message;

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in First Service";
    }

    @GetMapping("test/message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}