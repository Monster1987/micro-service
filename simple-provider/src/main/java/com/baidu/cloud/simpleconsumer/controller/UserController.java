package com.baidu.cloud.simpleconsumer.controller;

import com.baidu.cloud.simpleconsumer.entity.User;
import com.baidu.cloud.simpleconsumer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:zcf
 * @Date:2019/12/17
 * @Descirption:com.baidu.microservice.controller
 * @version:1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id){
        return this.userRepository.findOne(id);

    }
}
