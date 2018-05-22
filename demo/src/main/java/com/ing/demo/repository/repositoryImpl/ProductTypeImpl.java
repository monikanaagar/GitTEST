/**
 * 
 */
package com.ing.demo.repository.repositoryImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ing.demo.model.Product;
import com.ing.demo.model.Transaction;
import com.ing.demo.repository.IProductType;
import com.ing.demo.repository.ProductRepository;
import com.ing.demo.repository.TransactionRepository;

/**
 * @author krishnai
 *
 */
@Transactional
@Repository
public class ProductTypeImpl implements IProductType {

	private static final Logger logger = LoggerFactory.getLogger(ProductTypeImpl.class);
	// TODO : CRUD Repo. changes
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	/**
	 * Will get the product details based on customer ID.
	 */
	public Optional<List<Product>> fetchProductDetails(String custId) throws Exception {
		logger.info("Inside fetchProductDetails");
		return productRepository.findByAccountId(Integer.parseInt(custId));

	}

	public Optional<List<Transaction>> fetchTransactionDetails(String id, String rKey) throws Exception {
		return transactionRepository.findByIdAndRelationshipKey(Integer.parseInt(id), rKey);

	}

	public String updateTransaction(Transaction trans) throws Exception {
		Transaction s = transactionRepository.save(trans);
		return s.getTransaction_id();
	}

}
