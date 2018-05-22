/**
 * 
 */
package com.ing.demo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * this will return transaction history for products.
 * 
 * @author bdeshpan
 *
 */
@Entity
@Table(name = "transaction")
@JsonIgnoreProperties({ "product" })
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String transaction_id;

	@Column(name = "execution_date")
	private String executionDate;
	@Column(name = "comments")
	private String comments;

	@Column(name = "status")
	private String status;

	@Column(name = "relationship_key")
	private String relationshipKey;

	@Column(name = "product_type")
	private String productType;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	@JoinColumn(name = "id")
	private Set<Product> product;

	@Column(name = "id")
	private Integer id;

	@Column(name = "from_Account")
	private String fromAccount;
	
	@Column(name = "to_Account")
	private String toAccount;
	
	@Column(name = "toAccoutName")
	private String to_Accout_Name;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "amount")
	private Double amount;

	/**
	 * @return the transaction_id
	 */
	public String getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id
	 *            the transaction_id to set
	 */
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the executionDate
	 */
	public String getExecutionDate() {
		return executionDate;
	}

	/**
	 * @param executionDate
	 *            the executionDate to set
	 */
	public void setExecutionDate(String executionDate) {
		this.executionDate = executionDate;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the relationshipKey
	 */
	public String getRelationshipKey() {
		return relationshipKey;
	}

	/**
	 * @param relationshipKey
	 *            the relationshipKey to set
	 */
	public void setRelationshipKey(String relationshipKey) {
		this.relationshipKey = relationshipKey;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType
	 *            the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the product
	 */
	public Set<Product> getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the fromAccount
	 */
	public String getFromAccount() {
		return fromAccount;
	}

	/**
	 * @param fromAccount the fromAccount to set
	 */
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	/**
	 * @return the toAccount
	 */
	public String getToAccount() {
		return toAccount;
	}

	/**
	 * @param toAccount the toAccount to set
	 */
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	/**
	 * @return the to_Accout_Name
	 */
	public String getTo_Accout_Name() {
		return to_Accout_Name;
	}

	/**
	 * @param to_Accout_Name the to_Accout_Name to set
	 */
	public void setTo_Accout_Name(String to_Accout_Name) {
		this.to_Accout_Name = to_Accout_Name;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transaction_id == null) ? 0 : transaction_id.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		Transaction other = (Transaction) obj;
		if (transaction_id == null) {
			if (other.transaction_id != null)
				return false;
		} else if (!transaction_id.equals(other.transaction_id))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", executionDate=" + executionDate + ", comments="
				+ comments + ", status=" + status + ", relationshipKey=" + relationshipKey + ", productType="
				+ productType + ", product=" + product + ", id=" + id + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + ", to_Accout_Name=" + to_Accout_Name + ", currency=" + currency + ", amount=" + amount
				+ "]";
	}


}
