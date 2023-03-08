package com.bnp.test.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.test.entity.Quotation;
import com.bnp.test.entity.Subscription;
import com.bnp.test.service.QuotationService;
import com.bnp.test.service.SubscriptionService;

@RestController
@RequestMapping("/api")
public class SubscriptionRestController {

	private SubscriptionService subscriptionService;
	private QuotationService quotationService;

	@Autowired
	public SubscriptionRestController(SubscriptionService subscriptionService, QuotationService quotationService) {
		this.subscriptionService = subscriptionService;
		this.quotationService = quotationService;
	}


	@GetMapping("/subscriptions/{subscriptionId}")
	public Subscription getSubscription(@PathVariable int subscriptionId) {

		return subscriptionService.findById(subscriptionId);
	}

	@PostMapping("subscriptions")
	public Subscription updateSubscription(@RequestBody Subscription subscription) {
		if (subscription.getQuotation() != null) {
			Quotation quotation = quotationService.findById(subscription.getQuotation().getId());
			subscription.setQuotation(quotation);
		}
		subscriptionService.save(subscription);

		return subscription;
	}
}
