package testRunner;

import java.io.File;
import java.io.FileReader;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.vimalselvam.cucumber.listener.Reporter;

import BaseClass.TestBaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * TO GENERATE CUCUMBER EXTENT REPORT:-
 
1. Add dependencies to the POM:-cucumber-extentsreport and extentsreport

2. Create an extent-config.xml and populate it

3. Update the plugin for the Cucumber options

4. Add a method to the cucumber runner to generate the report

5. Run tests and view the report
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\shahn\\eclipse-workspace\\BDDCucumber\\src\\main\\java\\features\\TaggedHooksFeature.feature"
,glue= {"stepDefinition"}
,dryRun=false,
strict=true,
monochrome=true,
tags= {"@Sanity" , "@Smoke"},
plugin= {"pretty", "html:test-output","json:target/cucumber-reports/Cucumber.jso","junit:target/cucumber-reports/Cucumber.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentreport.html"}
)
public class Runnerclass {     
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("C:\\Users\\shahn\\git\\FahadLocalRepo\\BDDCucumber\\src\\main\\java\\configFile\\Extent-ConfigFile.xml");
	}
	

}