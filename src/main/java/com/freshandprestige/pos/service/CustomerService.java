package com.freshandprestige.pos.service;

import java.util.List;
import java.util.UUID;

import com.freshandprestige.pos.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import com.freshandprestige.pos.model.Customer;
import com.freshandprestige.pos.repo.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	private final CustomerRepo customerRepo;

	@Autowired
	public CustomerService(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	public Customer addCustomer(Customer customer){
		customer.setCustomerCode(UUID.randomUUID().toString());
		return customerRepo.save(customer);
	}

	public List<Customer> findAllCustomers(){
		return customerRepo.findAll();
	}

	public Customer updateCustomer(Customer customer){
		return customerRepo.save(customer);
	}

	public Customer findCustomerById(Long id){
		return customerRepo.findCustomerById(id).orElseThrow(() ->
				new UserNotFoundException("User by id " + id + "was not found"));
	}

	public void deleteCustomer(Long id){
		customerRepo.deleteCustomerById(id);
	}
}
