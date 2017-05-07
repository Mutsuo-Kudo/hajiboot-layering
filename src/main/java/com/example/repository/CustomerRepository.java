/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;

import com.example.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *
 * @author mukudo
 */
@Repository
public class CustomerRepository {

    private final ConcurrentMap<Integer, Customer> customerMap = new ConcurrentHashMap<>();

    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    public Customer findOne(Integer customerId) {
        return customerMap.get(customerId);
    }

    public Customer save(Customer customer) {
        return customerMap.put(customer.getId(), customer);
    }

    public void delete(Integer customerId) {
        customerMap.remove(customerId);
    }
}
