/**
 * 
 */
package com.ing.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author bdeshpan
 *
 */
@Entity
@Table(name="loan") 
public class Loan implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer loan_Num;
	@Column(name="loan_Type")
	private String loan_Type;
	@Column(name="loan_Amt")
	private BigDecimal loanAmt;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id",nullable=false) 
	private Product id;
	@Column(name="interest_Rate")
	private BigDecimal interestRate;
	/**
	 * @return the loanNum
	 */
	public Integer getLoanNum() {
		return loan_Num;
	}
	/**
	 * @param loanNum the loanNum to set
	 */
	public void setLoanNum(Integer loanNum) {
		this.loan_Num = loanNum;
	}
	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loan_Type;
	}
	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loan_Type = loanType;
	}
	/**
	 * @return the loanAmt
	 */
	public BigDecimal getLoanAmt() {
		return loanAmt;
	}
	/**
	 * @param loanAmt the loanAmt to set
	 */
	public void setLoanAmt(BigDecimal loanAmt) {
		this.loanAmt = loanAmt;
	}
		/**
	 * @return the id
	 */
	public Product getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Product id) {
		this.id = id;
	}
		/**
	 * @return the interestRate
	 */
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loan [loanNum=" + loan_Num + ", loanType=" + loan_Type + ", loanAmt=" + loanAmt + ", id=" + id
				+ ", interestRate=" + interestRate + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loanAmt == null) ? 0 : loanAmt.hashCode());
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
		Loan other = (Loan) obj;
		if (loanAmt == null) {
			if (other.loanAmt != null)
				return false;
		} else if (!loanAmt.equals(other.loanAmt))
			return false;
		return true;
	}
	
	
}
