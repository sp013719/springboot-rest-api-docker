package com.restapi.controller;

import com.restapi.request.Customer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    private final RedisTemplate<String, Customer> redisTemplate;

    public CustomersController(RedisTemplate<String, Customer> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping
    public String getCustomer() {
        return "http GET request to get the customer details";
    }

    @GetMapping(path = "/{customerId}")
    public ResponseEntity<Customer> getCustomerId(@PathVariable String customerId) {
        Customer customer = this.redisTemplate.opsForValue().get(customerId);

        return ResponseEntity.ok(customer);
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        String id = UUID.randomUUID().toString();
        customer.setId(id);
        this.redisTemplate.opsForValue().set(id, customer);

        return ResponseEntity.ok(customer);
    }

    @PutMapping
    public String updateCustomer() {
        return "http GET request to update the customer details";
    }

    @DeleteMapping
    public String deleteCustomer() {
        return "http GET request to delete the customer";
    }
}
