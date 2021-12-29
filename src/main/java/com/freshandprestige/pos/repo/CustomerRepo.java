package com.freshandprestige.pos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshandprestige.pos.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
