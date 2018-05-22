package com.ing.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ing.demo.model.Product;
import com.ing.demo.model.Transaction;

public class TestData {

    public static Optional<List<Product>> dummyProduct() {
    	
    	List<Product> product = new ArrayList<Product>();
    	Product p = new Product();
        p.setAccountId(123);
        p.setName("AAAA");
        product.add(p);
        return Optional.ofNullable(product);
    }

    public static ArrayList<Transaction> dummyTransctions() {
        ArrayList<Transaction> transactionsList = new ArrayList<Transaction>();
        Transaction transaction = new Transaction();
        transaction.setProductType("Loan");
        transaction.setExecutionDate("4-May-2018");
        transaction.setStatus("Completed");
        transaction.setComments("Loan Transaction");
        transactionsList.add(transaction);
        return transactionsList;
    }

}
