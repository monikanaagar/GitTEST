package com.ing.demo.service;

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
import com.ing.demo.repository.repositoryImpl.ProductTypeImpl;
@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    ProductTypeImpl productType;

    @InjectMocks
    private ProductServiceImpl productService;


    @Test
    public void getProductxDetails()throws Exception{
    	Optional<List<Product>> prodList=TestData.dummyProduct();
        when(productType.fetchProductDetails("123")).thenReturn(prodList);
        productService.fetchProducts("123");
        assertNotNull(prodList);
    }

    @Test
    public void getTransactionHistory() throws Exception{
        ArrayList<Transaction> transactionsList = TestData.dummyTransctions();
        productService.getTransactionDetail("123","122");
        assertThat(1, is(equalTo(transactionsList.size())));
    }
}


