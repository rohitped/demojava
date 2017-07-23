package com.inportia.june10framework;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\resources",
		glue= "stepdef",
		tags= {"@dd"},
		monochrome=true,
		dryRun=false
		)
public class runner {
	
	

}
