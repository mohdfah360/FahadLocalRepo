package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksFeature {
	
//	@Before
//	public void setUp()
//	{
//		System.out.println("Launch  FF");
//		System.out.println("Enter URL for application");
//	}
//	
//	@After
//	public void tearDown() 
//	{
//		System.out.println("tear down the data application");
//	}
	
	
	@Given("user is  on homepag")
	public void user_is_on_homepag()
	{
	    System.out.println("user is  on homepag");
	}

	@When("user navigates to Log")
	public void user_navigates_to_Log()
	{
	    System.out.println("user navigates to Log");

	}

	@Then("Tite of The page is")
	public void tite_of_The_page_is() 
	{
	    System.out.println("Tite of The page is");
	}

//	@Given("user is  on homepag1")
//	public void user_is_on_homepag1() 
//	{
//	   
//	}
//
//	@When("user navigates to Log1")
//	public void user_navigates_to_Log1()
//	{
//	  
//	}
//
//	@Then("Tite of The page is1")
//	public void tite_of_The_page_is1() 
//	{
//	 
//	}
//
//	@Given("user is  on homepag2")
//	public void user_is_on_homepag2() 
//	{
//	   
//	}
//
//	@When("user navigates to Log2")
//	public void user_navigates_to_Log2() 
//	{
//	 
//	}
//
//	@Then("Tite of The page is2")
//	public void tite_of_The_page_is2() 
//	{
//	    
//	}

}
