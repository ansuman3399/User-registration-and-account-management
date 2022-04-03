package com.blog.photoapp.api.users.controller;

import com.blog.photoapp.api.users.entity.User;
import com.blog.photoapp.api.users.feignclient.UserFeignClient;
import com.blog.photoapp.api.users.model.UserRequest;
import com.blog.photoapp.api.users.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/status/check")
    public String status() {
        return "working!";
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody @Valid UserRequest userRequest) {
//        return userService.createUser(userRequest);
        return new User();
    }

    @GetMapping("/status/check/feign/accounts")
    public String accountStatusFeign() {

        return userFeignClient.status();
    }

    @GetMapping("/status/check/rest/accounts")
    public String accountStatusRest() throws URISyntaxException {

//        URI uri = new URI("account-mgmt-ms/account/status/check");
//        return restTemplate.getForObject(uri,String.class);
        String url = "http://ACCOUNT-MGMT-MS/account/status/check";
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        return exchange.getBody();

    }

}
