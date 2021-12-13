package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:features",
				glue = "stepDefinitions",
				tags = {""}
				)
public class MainRunner extends AbstractTestNGCucumberTests{

}
