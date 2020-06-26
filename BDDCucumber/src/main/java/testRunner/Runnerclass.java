package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\shahn\\eclipse-workspace\\BDDCucumber\\src\\main\\java\\features\\TaggedHooksFeature.feature"
,glue= {"stepDefinition"}
,dryRun=false,
strict=true,
monochrome=true,
//tags= {"@Sanity" , "@Smoke"},
plugin= {"pretty", "html:test-output","json:target/cucumber-reports/Cucumber.jso","junit:target/cucumber-reports/Cucumber.xml"}
)
public class Runnerclass {                

}