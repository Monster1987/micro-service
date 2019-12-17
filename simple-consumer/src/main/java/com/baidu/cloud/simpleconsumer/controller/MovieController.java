package com.baidu.cloud.simpleconsumer.controller;

import com.baidu.cloud.simpleconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther:zcf
 * @Date:2019/12/17
 * @Descirption:com.baidu.cloud.simpleprovider.controller
 * @version:1.0
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")

    public User findById(@PathVariable("id") Long id){
        return this.restTemplate.getForObject("http://localhost:7900/user/"+id, User.class);
    }
}
