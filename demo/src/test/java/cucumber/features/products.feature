Feature: Customer product and transaction details

Scenario: Get the customer product details
Given   A customer ,send the request for the prouduct details
When the a authorise the customer
Then  it shows all the product information- current accounts, saving accounts, loan and securities.
