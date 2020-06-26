package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	WebDriver driver;
	
	@Given("user is  on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahn\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() {
	   WebElement loginBtn = driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']"));
	   loginBtn.click();
	}

	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_Password(String user_Name, String pwd) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Login']")));
		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='email']"));
		emailAddress.sendKeys(user_Name);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pwd);
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	    loginButton.click();
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() {
//		WebElement text = driver.findElement(By.xpath("//i[@class='home icon']"));
//		String verifytext= text.getText();
//		System.out.println(verifytext);
//		Assert.assertEquals(verifytext, "Home");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");

	}
	
	@Then("LogOut from the Application")
	public void LogOut_from_the_Application() throws InterruptedException
	{
		WebElement logOutMenu = driver.findElement(By.xpath("//div[@class='ui basic button floating item dropdown']"));
	    logOutMenu.click();
	    WebElement logOutIcon = driver.findElement(By.xpath("//span[text()='Log Out']"));
	    logOutIcon.click();
	    Thread.sleep(5000);
	
	}
	
	
	
	
}