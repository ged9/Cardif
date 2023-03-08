package com.bnp.test.service;

import com.bnp.test.entity.Quotation;

public interface QuotationService {

	public Quotation findById(int id);
	public Quotation save(Quotation quotation);
}
