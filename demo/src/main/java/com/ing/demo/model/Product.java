/**
 * 
 */
package com.ing.demo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author bdeshpan This will hold the Product Object.
 *
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;

	@Column(name = "account_Id")
	private Integer accountId;

	@OneToMany(mappedBy = "id")
	@JsonManagedReference
	private Set<AccountNumber> accountNumber;
	@OneToMany(mappedBy = "id")
	@JsonManagedReference
	private Set<Loan> loan;
	@OneToMany(mappedBy = "id")
	@JsonManagedReference
	private Set<Payment> payment;
	@OneToMany(mappedBy = "id")
	@JsonManagedReference
	private Set<Card> card;
	@OneToMany(mappedBy = "id")
	@JsonManagedReference
	private Set<Insurance> insurance;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", accountId=" + accountId + ", name=" + name + ", type=" + type
				+ ", accountNumber=" + accountNumber + ", loan=" + loan + ", payment=" + payment + ", card=" + card
				+ ", insurance=" + insurance + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	 /* (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Set<AccountNumber> getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Set<AccountNumber> accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Set<Loan> getLoan() {
		return loan;
	}

	public void setLoan(Set<Loan> loan) {
		this.loan = loan;
	}

	public Set<Payment> getPayment() {
		return payment;
	}

	public void setPayment(Set<Payment> payment) {
		this.payment = payment;
	}

	public Set<Card> getCard() {
		return card;
	}

	public void setCard(Set<Card> card) {
		this.card = card;
	}

	public Set<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Set<Insurance> insurance) {
		this.insurance = insurance;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

}
