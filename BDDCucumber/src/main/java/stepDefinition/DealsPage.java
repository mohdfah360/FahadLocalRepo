package stepDefinition;

import java.util.List;
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

public class DealsPage {
	
	WebDriver driver;
	
	@Given("user is  on homepage again")
	public void user_is_on_homepage_again()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahn\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	}

	@When("user navigates to Login Page again")
	public void user_navigates_to_Login_Page_again()
	{
		
	 WebElement loginBtn = driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']"));
	 loginBtn.click();
	 
	}

	

	@When("user try to enters userName and password")
	public void user_try_to_enters_userName_and_password(DataTable data)
	
	{
		List<List<String>> nnn =data.asLists();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Login']")));
		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='email']"));
		emailAddress.sendKeys(nnn.get(0).get(0));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(nnn.get(0).get(1));
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	    loginButton.click();
	
	}

	@Then("user click on Deals Page")
	public void user_click_on_Deals_Page()
	{
		WebElement objDeals = driver.findElement(By.xpath("//span[text()='Deals']"));
		objDeals.click();
	}

	@Then("user click on newDeals button")
	public void user_click_on_newDeals_button()
	{
		WebElement newObjDealsbtn = driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[5]"));
		newObjDealsbtn.click();
	}

	@Then("user enters all details as click on save button")
	public void user_enters_all_details_as_click_on_save_button(DataTable data1)
	{
			List<List<String>> listData = data1.asLists();
			WebElement titleInput = driver.findElement(By.xpath("//input[@name='title']"));
			titleInput.sendKeys(listData.get(0).get(0));
			WebElement probabilitysInput = driver.findElement(By.xpath("//input[@name='probability']"));
			probabilitysInput.sendKeys(listData.get(0).get(1));
			WebElement descriptionInput = driver.findElement(By.xpath("//textarea[@name='description']"));
			descriptionInput.sendKeys(listData.get(0).get(2));
			
			
	}

	@Then("Deals Created")
	public void deals_Created() 
	{
	 WebElement saveBtn = driver.findElement(By.xpath("//button[text()='Save']")); 
	 saveBtn.click();
	}



}
