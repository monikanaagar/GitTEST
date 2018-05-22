/**
 * 
 */
package com.ing.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.demo.model.Product;

/**
 * @author bdeshpan
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Optional<List<Product>> findByAccountId (int i); 
	

}
