package lab06.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

import lab06.models.DummyUser;

public class SamplePost extends WebDriverPage {
	
    private final static String AUTHOR = "//div[contains(@class, 'comment-form-author')]/div[1]/input[1]";
    private final static String EMAIL_ID = "email";
    private final static String COMMENT_ID = "comment";
    private final static String SUBMIT_ID = "submit";

    private final static String RESULT = "//ol[contains(@class, 'comment-list')]/li[last()]/article[1]/div[2]/p[1]";

    private String sampleComment;
    private DummyUser dummyUser;

	public SamplePost(WebDriverProvider driverProvider) {
		super(driverProvider);
        dummyUser = new DummyUser();
        sampleComment = "Test comment in sample post";
	}

	public void open() {
		get("http://demoqa.com/sample-post2/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

    public void fillUserName() {
		findElement(By.xpath(AUTHOR)).sendKeys(dummyUser.getUserName());
	}

    public void fillEmail() {
		findElement(By.id(EMAIL_ID)).sendKeys(dummyUser.getEmail());
	}

    public void fillComment() {
		findElement(By.id(COMMENT_ID)).sendKeys(sampleComment);
	}

    public void clickSubmitButton() {
		findElement(By.id(SUBMIT_ID)).click();
	}

    public String getResult() {
		return findElement(By.xpath(RESULT)).getText();
	}

    public String getSampleComment() {
        return sampleComment;
    }

}