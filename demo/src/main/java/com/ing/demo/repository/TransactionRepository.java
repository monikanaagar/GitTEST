/**
 * 
 */
package com.ing.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.demo.model.Transaction;

/**
 * @author bdeshpan
 *
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
	public Optional<List<Transaction>> findByIdAndRelationshipKey(Integer idI, String rKey); 
	

}
