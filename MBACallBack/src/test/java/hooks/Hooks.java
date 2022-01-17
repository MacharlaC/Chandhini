package hooks;


import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	


	@Before
	public  void beforeScenario(){
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandhinimacharla\\eclipse-workspace\\MBACallBack\\chromedriver.exe");
	       Selenium.LocalDriver.driver = new ChromeDriver();
	      
	       Selenium.LocalDriver.driver.manage().window().maximize();
	       
	}
	


@After(order = 0)
public void AfterSteps() {
	Selenium.LocalDriver.driver.close();		
}
	


}
