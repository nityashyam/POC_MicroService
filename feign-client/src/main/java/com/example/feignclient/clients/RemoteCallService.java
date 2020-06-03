package com.example.feignclient.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Gateway")
public interface RemoteCallService {
    @RequestMapping(method= RequestMethod.GET, value="/employee/message")
    public String getData();

}
