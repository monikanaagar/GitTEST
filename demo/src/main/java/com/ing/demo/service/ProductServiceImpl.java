/**
 * 
 */
package com.ing.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.demo.model.Product;
import com.ing.demo.model.Transaction;
import com.ing.demo.repository.repositoryImpl.ProductTypeImpl;
import com.ing.demo.utility.EncryptDecryptUtility;

/**
 * @author krishnai
 *
 */

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductTypeImpl paymentImpl;
	@Autowired
	private EncryptDecryptUtility decryptUtility;

	@Override
	public Optional<List<Product>> fetchProducts(String id) throws Exception {
		return paymentImpl.fetchProductDetails(id);
	}

	@Override
	public String validateKey(byte[] decrypt) throws Exception {
		return decryptUtility.Decrypt(decrypt);
	}

	@Override
	public Optional<List<Transaction>> getTransactionDetail(String productId, String rKey) throws Exception {
		return paymentImpl.fetchTransactionDetails(productId, rKey);
	}

	@Override
	public String updateTransaction(Transaction trans) throws Exception
	{
		return paymentImpl.updateTransaction(trans);
	} 
 
}
