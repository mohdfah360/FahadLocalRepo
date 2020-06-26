package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooks {

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the every Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the every Scenario");
	}

	@Before("@First")
	public void beforeFirst() {
		System.out.println("This will run only before the First Scenario");
	}

	@After("@First")
	public void afterFirst()
	{
		System.out.println("This will run only after the First Scenario");
	}
	@Given("user is  on homepagq")
	public void user_is_on_homepagq() {

	}

	@When("user navigates to Logq")
	public void user_navigates_to_Logq() {

	}

	@Then("Tite of The page isq")
	public void tite_of_The_page_isq() {

	}

//	@Given("user is  on homepag1q")
//	public void user_is_on_homepag1q() 
//	{
//	   
//	}
//
//	@When("user navigates to Log1q")
//	public void user_navigates_to_Log1q() 
//	{
//	    
//	}
//
//	@Then("Tite of The page is1q")
//	public void tite_of_The_page_is1q()
//	{
//	
//	}
//
//	@Given("user is  on homepag2q")
//	public void user_is_on_homepag2q()
//	{
//	  
//	}
//
//	@When("user navigates to Log2q")
//	public void user_navigates_to_Log2q() 
//	{
//	   
//	}
//
//	@Then("Tite of The page is2q")
//	public void tite_of_The_page_is2q()
//	{
//	  
//	}

}
