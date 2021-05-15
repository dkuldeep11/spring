package com.kd.spring.jpa.controller;

import com.kd.spring.jpa.dao.CustomerRepository;
import com.kd.spring.jpa.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/get")
    public String getName(@RequestParam(defaultValue = "0") String id) {
        Customer customer = repository.findById((Integer.parseInt(id)));
        return customer.toString();
    }

}
