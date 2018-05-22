/**
 * 
 */
package com.ing.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.demo.model.Product;
import com.ing.demo.model.Transaction;
import com.ing.demo.service.ProductService;
import com.ing.demo.utility.EncryptDecryptUtility;

/**
 * @author krishnai
 *
 */
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/**
	 * @param id
	 * @return list of products.
	 */
	@RequestMapping(value = "ing/product/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<List<Product>> getProducts(@Valid @PathVariable(required=true) String id) throws Exception {
		return productService.fetchProducts(id);
	}
	
	@RequestMapping(value = "ing/transaction/{id}/{rKey}", method = RequestMethod.GET, produces = "application/json")
	public Optional<List<Transaction>> getProductTransactionDetails(@PathVariable String id,@PathVariable String rKey) throws Exception {
		return  productService.getTransactionDetail(id,rKey);
	}
	
	@RequestMapping(value = "ing/transactions/update", method = RequestMethod.POST,consumes = "application/json")
	public String makeTransaction(@RequestBody  Transaction trans) throws Exception {	
		return productService.updateTransaction(trans);
	}	

}
