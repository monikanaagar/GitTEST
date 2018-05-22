/**
 * 
 */
package com.ing.demo.service;

import java.util.List;
import java.util.Optional;

import com.ing.demo.model.Product;
import com.ing.demo.model.Transaction;

/**
 * @author krishnai
 *
 */
public interface ProductService {

	public Optional<List<Product>> fetchProducts(String Id) throws Exception;

	public String validateKey(byte[] decrypt) throws Exception;

	public Optional<List<Transaction>> getTransactionDetail(String productId, String rKey) throws Exception;

	public String updateTransaction(Transaction trans) throws Exception;

}
