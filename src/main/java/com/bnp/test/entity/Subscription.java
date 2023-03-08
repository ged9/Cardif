package com.bnp.test.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subscription")
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	private Quotation quotation;

	@Column(name = "start_date")
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date startDate;

	@Column(name = "valid_until")
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date validUntil;


	public Subscription() {
	}

	public Subscription(int id, Quotation quotation, Date startDate, Date validUntil) {
		this.id = id;
		this.quotation = quotation;
		this.startDate = startDate;
		this.validUntil = validUntil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

	@Override
	public String toString() {
		return "Subscription{" +
				"id=" + id +
				", quotation=" + quotation +
				", startDate=" + startDate +
				", validUntil=" + validUntil +
				'}';
	}
}
