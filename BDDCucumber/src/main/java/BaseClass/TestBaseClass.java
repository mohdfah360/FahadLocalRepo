package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestBaseClass {
	
	public static WebDriver driver;
	public static Properties prop;

	
	public TestBaseClass() throws IOException {
		// 1)Read Properties file
		{

			FileInputStream file = new FileInputStream(
					"C:\\Users\\shahn\\eclipse-workspace\\FreeCRM\\src\\main\\java\\com\\Qualitymatters\\qa\\config\\config.properties");
			prop = new Properties();
			prop.load(file);

		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shahn\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			if (browserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\shahn\\Downloads\\chromedriver_win32\\chromedriver_win32\\FFdriver.exe");
			}
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));

	}
	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("extent-reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
