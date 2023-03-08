package com.bnp.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnp.test.entity.Quotation;

public interface QuotationRepository extends JpaRepository<Quotation, Integer> {
}
