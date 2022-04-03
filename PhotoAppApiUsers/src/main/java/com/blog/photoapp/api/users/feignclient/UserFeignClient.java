package com.blog.photoapp.api.users.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "account-mgmt-ms" , path = "/account")
public interface UserFeignClient {

    @GetMapping("/status/check")
    public String status();

}
