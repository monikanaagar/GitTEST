package com.ing.demo.repository;

import java.util.List;
import java.util.Optional;

import com.ing.demo.model.Product;
import com.ing.demo.model.Transaction;

public interface IProductType {

	public Optional<List<Product>> fetchProductDetails(String custId) throws Exception;

	public Optional<List<Transaction>> fetchTransactionDetails(String productId, String productType) throws Exception;
}
