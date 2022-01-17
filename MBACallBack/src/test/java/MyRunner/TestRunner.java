package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		strict = false,
		features = {"src/test/java/Features/CallBack.feature"},
		glue = {"stepsDefinitions"},
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:" }, 
		monochrome = true	
		)

public class TestRunner {

}
