package com.bnp.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bnp.test.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {
}
