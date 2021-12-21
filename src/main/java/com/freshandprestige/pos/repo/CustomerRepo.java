package com.freshandprestige.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshandprestige.pos.model.Customer;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

    void deleteCustomerById(Long id);

    Optional<Customer> findCustomerById(Long id);
}
