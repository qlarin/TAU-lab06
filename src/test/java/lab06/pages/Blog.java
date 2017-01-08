package lab06.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class Blog extends WebDriverPage {
	
	private final static String SAMPLE_POST_LINK = "//*[@id='post-379']/header[1]/h2[1]/a[1]";

	public Blog(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void open() {
		get("http://demoqa.com/blog/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void clickSamplePostLink(){
		findElement(By.xpath(SAMPLE_POST_LINK)).click();
	}

}