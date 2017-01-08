package lab06.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class Home extends WebDriverPage {
    
    private final static String REGISTRATION_LINK = "//*[@id='menu-registration']/li[1]/a[1]";

	public Home(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void open() {
		get("http://demoqa.com/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

    public void clickRegistrationLink(){
		findElement(By.xpath(REGISTRATION_LINK)).click();
	}

}