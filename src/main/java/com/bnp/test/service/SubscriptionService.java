package com.bnp.test.service;

import com.bnp.test.entity.Subscription;

public interface SubscriptionService {

	public Subscription findById(int id);

	public Subscription save(Subscription subscription);
}
