package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageWithMapObject 
{
WebDriver driver;

	@Given("user is  on homepage again and again")
	public void user_is_on_homepage_again_and_again()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahn\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@When("user navigates to Login Page again and again")
	public void user_navigates_to_Login_Page_again_and_again() 
	{
		 WebElement loginBtn = driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']"));
		 loginBtn.click();
	}

	@When("user try to enters userName and password again")
	public void user_try_to_enters_userName_and_password_again(DataTable credentials)
	{
		Map<String, String> map = credentials.asMap(String.class, String.class);
		
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Login']")));
			WebElement emailAddress = driver.findElement(By.xpath("//input[@name='email']"));
			emailAddress.sendKeys(map.get("USERNAMES"));
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys(map.get("PASSWORD"));
			WebElement loginButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		    loginButton.click();
			
		

		}

	

//	@Then("user click on Deals Page again")
//	public void user_click_on_Deals_Page_again() {
//	   
//	}
//
//	@Then("user click on newDeals button again")
//	public void user_click_on_newDeals_button_again() {
//	  
//	}
//
//	@Then("user enters all details as click on save button again")
//	public void user_enters_all_details_as_click_on_save_button_again(DataTable dataTable1)
//	{
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    
//	}
//	
//	@Then("Deals Created again")
//	public void deals_Created_again() {
//	   
//	}


}
