package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contacts {
	
	WebDriver driver;
	
	@Given("user is  on homepage1")
	public void user_is_on_homepage1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahn\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user navigates to Login Page1$")
	public void user_navigates_to_Login_Page1() {
	   WebElement loginBtn = driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']"));
	   loginBtn.click();
	}

	@When("^user enters the \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_Password1(String userName, String passwords) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Login']")));
		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='email']"));
		emailAddress.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwords);
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	    loginButton.click();
	}

	@When("user click on Contacts option")
	public void user_click_on_Contacts_option() throws InterruptedException {
	WebElement contactsEle = driver.findElement(By.xpath("//span[text()='Contacts']"));
	contactsEle.click();
	Thread.sleep(9000);
	}

	@When("user click o New button")
	public void user_click_o_New_button() throws InterruptedException 
	{
		driver.navigate().refresh();
		WebElement newBtn = driver.findElement(By.xpath("//button[text()='New']"));
		Thread.sleep(5000);
		newBtn.click();
		
		Thread.sleep(9000);
		
	}

	@Then("^user enters \"(.*)\" and The \"(.*)\"$")
	public void user_enters_FirstName_and_The_LastName(String EfirstName, String ElastName) 
	{
		WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstName.sendKeys(EfirstName);
		WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastName.sendKeys(ElastName);
	  
	}

	@Then("user click on save button")
	public void user_click_on_save_button()
	{
		WebElement newBtn = driver.findElement(By.xpath("//button[text()='Save']"));
		newBtn.click();
	   
	}

	@Then("verify newely created contacts")
	public void verify_newely_created_contacts()
	{
		WebElement createdContact = driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']"));
		String textCreatedContact = createdContact.getText();
		System.out.println(textCreatedContact);
	}
	
	@Then("move to home Page")
	public void move_to_home_Page() {
	    System.out.println("user move to home page");
	}

	
}
