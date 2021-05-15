package com.kd.spring.jpa.dao;

import java.util.List;

import com.kd.spring.jpa.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
