package cucumber.stepdef;

import com.ing.demo.controller.ProductController;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefiniation {
    ProductController productController=new ProductController();

    @Given("^A customer ,send the request for the prouduct details$")
    public void a_customer_send_the_request_for_the_prouduct_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^the a authorise the customer$")
    public void the_a_authorise_the_customer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // productController.getProductTransactionDetails("22","key");
        throw new PendingException();
    }

    @Then("^it shows all the product information- current accounts, saving accounts, loan and securities\\.$")
    public void it_shows_all_the_product_information_current_accounts_saving_accounts_loan_and_securities() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
