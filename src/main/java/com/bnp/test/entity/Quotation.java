package com.bnp.test.entity;

import java.math.BigDecimal;
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
@Table(name="quotation")
public class Quotation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "begining_of_insurance")
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date beginingOfInsurance;

	@Column(name = "insured_amount")
	private BigDecimal insuredAmount;

	@Column(name = "date_of_signing_mortgage")
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date dateOfSigningMortgage;

	@ManyToOne
	private Customer customer;

	public Quotation() {
	}

	public Quotation(int id) {
		this.id = id;
	}

	public Quotation(int id, Date beginingOfInsurance, BigDecimal insuredAmount, Date dateOfSigningMortgage, Customer customer) {
		this.id = id;
		this.beginingOfInsurance = beginingOfInsurance;
		this.insuredAmount = insuredAmount;
		this.dateOfSigningMortgage = dateOfSigningMortgage;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBeginingOfInsurance() {
		return beginingOfInsurance;
	}

	public void setBeginingOfInsurance(Date beginingOfInsurance) {
		this.beginingOfInsurance = beginingOfInsurance;
	}

	public BigDecimal getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(BigDecimal insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public Date getDateOfSigningMortgage() {
		return dateOfSigningMortgage;
	}

	public void setDateOfSigningMortgage(Date dateOfSigningMortgage) {
		this.dateOfSigningMortgage = dateOfSigningMortgage;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Quotation{" +
				"id=" + id +
				", beginingOfInsurance=" + beginingOfInsurance +
				", insuredAmount=" + insuredAmount +
				", dateOfSigningMortgage=" + dateOfSigningMortgage +
				", customer=" + customer +
				'}';
	}
}
