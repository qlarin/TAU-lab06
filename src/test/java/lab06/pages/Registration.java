package lab06.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

public class Registration extends WebDriverPage{
	
	public Registration(WebDriverProvider driverProvider) {
		super(driverProvider);		
	}

	public void open() {
		get("http://demoqa.com/registration/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
