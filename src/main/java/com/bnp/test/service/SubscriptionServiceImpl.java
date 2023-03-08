package com.bnp.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.test.dao.SubscriptionRepository;
import com.bnp.test.entity.Subscription;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
	private SubscriptionRepository subscriptionRepository;

	@Autowired
	public SubscriptionServiceImpl(SubscriptionRepository subscriptionRepository) {
		this.subscriptionRepository = subscriptionRepository;
	}

	@Override
	public Subscription findById(int id) {
		Optional<Subscription> result = subscriptionRepository.findById(id);
		return result.orElse(null);
	}

	@Override
	public Subscription save(Subscription subscription) {
		return subscriptionRepository.save(subscription);
	}

}
