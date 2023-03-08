package com.bnp.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnp.test.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
