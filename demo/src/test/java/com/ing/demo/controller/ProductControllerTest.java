	package com.ing.demo.controller;

	import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ing.demo.TestData;
import com.ing.demo.model.Product;
import com.ing.demo.model.Transaction;
import com.ing.demo.service.ProductService;
import com.ing.demo.utility.EncryptDecryptUtility;

/**
 * will excute test case on controller.
 * @author bdeshpan
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

	@Mock
	ProductService productService;

	@Mock
	private EncryptDecryptUtility decryptUtility;

	@InjectMocks
	ProductController productController;

	@Test
	public void getProductDetails() throws Exception{
		Optional<List<Product>> prodList = TestData.dummyProduct();
			when(productService.fetchProducts("123")).thenReturn(prodList);
		   // when(productService.validateKey(decryptUtility.Encrtpy("123"))).thenReturn("123");
			productController.getProducts("123");
			assertNotNull(prodList);
	}

	@Test
    public void getTransactionHistory() throws Exception{
        ArrayList<Transaction> transactionsList = TestData.dummyTransctions();
        productController.getProductTransactionDetails("122","test");
        assertThat(1, is(equalTo(transactionsList.size())));
    }

}
