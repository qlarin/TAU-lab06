package lab06.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

import lab06.models.DummyUser;

public class Registration extends WebDriverPage {
	
	private final static String FIRSTNAME_ID = "name_3_firstname";
	private final static String LASTNAME_ID = "name_3_lastname";
	private final static String PHONE_ID = "phone_9";
	private final static String USERNAME_ID = "username";
	private final static String EMAIL_ID = "email_1";
	private final static String PASSWORD_ID = "password_2";
	private final static String CONFIRM_PASSWORD_ID = "confirm_password_password_2";
	private final static String HOBBY_CHECKBOX = "//*[@id='pie_register']/li[3]/div[1]/div[1]/input[2]";
	private final static String SUBMIT = "//div[contains(@class, 'piereg_submit_button')]/input[1]";
	private final static String RESULT = "//p[contains(@class, 'piereg_message')]";
	private final static String BLOG_LINK = "//*[@id='menu-primary-menu']/li[5]/a[1]";

	private String successMessage;
	private DummyUser dummyUser;

	public Registration(WebDriverProvider driverProvider) {
		super(driverProvider);
		dummyUser = new DummyUser();
		successMessage = "Thank you for your registration";
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public String getResult() {
		return findElement(By.xpath(RESULT)).getText();
	}

	public void open() {
		get("http://demoqa.com/registration/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void fillFirstName() {
		findElement(By.id(FIRSTNAME_ID)).sendKeys(dummyUser.getFirstName());
	}

	public void fillLastName() {
		findElement(By.id(LASTNAME_ID)).sendKeys(dummyUser.getLastName());
	}

	public void checkHobby() {
		findElement(By.xpath(HOBBY_CHECKBOX)).click();
	}

	public void fillPhoneNumber() {
		findElement(By.id(PHONE_ID)).sendKeys(dummyUser.getPhone());
	}

	public void fillUsername() {
		findElement(By.id(USERNAME_ID)).sendKeys(dummyUser.getUserName());
	}

	public void fillEmail() {
		findElement(By.id(EMAIL_ID)).sendKeys(dummyUser.getEmail());
	}

	public void enterPassword() {
		findElement(By.id(PASSWORD_ID)).sendKeys(dummyUser.getPassword());
	}

	public void repeatPassword() {
		findElement(By.id(CONFIRM_PASSWORD_ID)).sendKeys(dummyUser.getPassword());
	}

	public void clickSubmitButton() {
		findElement(By.xpath(SUBMIT)).click();
	}

	public void clickBlogLink() {
		findElement(By.xpath(BLOG_LINK)).click();
	}
}