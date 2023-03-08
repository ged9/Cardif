package com.bnp.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.test.dao.QuotationRepository;
import com.bnp.test.entity.Quotation;

@Service
public class QuotationServiceImpl implements QuotationService {
	private QuotationRepository quotationRepository;

	@Autowired
	public QuotationServiceImpl(QuotationRepository quotationRepository) {
		this.quotationRepository = quotationRepository;
	}


	@Override
	public Quotation findById(int id) {
		Optional<Quotation> result = quotationRepository.findById(id);
		return result.orElse(null);
	}

	@Override
	public Quotation save(Quotation quotation) {
		return quotationRepository.save(quotation);
	}

}
