package com.bnp.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.test.entity.Customer;
import com.bnp.test.entity.Quotation;
import com.bnp.test.service.CustomerService;
import com.bnp.test.service.QuotationService;

@RestController
@RequestMapping("/api")
public class QuotationRestController {

	private QuotationService quotationService;
	private CustomerService customerService;

//	public QuotationRestController(QuotationService quotationService) {
//		this.quotationService = quotationService;
//	}

	@Autowired
	public QuotationRestController(QuotationService quotationService, CustomerService customerService) {
		this.quotationService = quotationService;
		this.customerService = customerService;
	}

	@PostMapping("quotations")
	public Quotation updateQuotation(@RequestBody Quotation quotation) {
		if (quotation.getCustomer() != null) {
			Customer customer = customerService.findById(quotation.getCustomer().getId());
			quotation.setCustomer(customer);
		}
		quotationService.save(quotation);

		return quotation;
	}
}
