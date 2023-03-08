package com.bnp.test.service;

import java.util.List;

import com.bnp.test.entity.Customer;

public interface CustomerService {

	public List<Customer> findAll();

	public Customer findById(int id);

	public Customer save(Customer customer);
}
