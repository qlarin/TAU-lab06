package lab06.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

import lab06.Pages;

public class DemoqaRegistrationSteps {
	
	private final Pages pages;

	public DemoqaRegistrationSteps(Pages pages) {
		this.pages = pages;
	}

    @Given("user is on Registration page")
    public void userIsOnRegistrationPage() {        
        pages.registration().open();        
    }

    @When("user fills firstname")
    public void userFillsFirstName() {
        pages.registration().fillFirstName();
    }

    @When("user fills lastname")
    public void userFillsLastName() {
        pages.registration().fillLastName();
    }

    @When("user checks hobby")
    public void userChecksHobby() {
        pages.registration().checkHobby();
    }

    @When("user fills phone")
    public void userFillsPhone() {
        pages.registration().fillPhoneNumber();
    }

    @When("user fills username")
    public void userFillsUsername() {
        pages.registration().fillUsername();
    }

    @When("user fills email")
    public void userFillsEmail() {
        pages.registration().fillEmail();
    }

    @When("user enters password")
    public void userEntersPassword() {
        pages.registration().enterPassword();
    }

    @When("user repeat password")
    public void userRepeatPassword() {
        pages.registration().repeatPassword();
    }

    @When("user clicks submit button")
    public void userClicksSubmitButton() {
        pages.registration().clickSubmitButton();
    }

    @Then("success message has appeard")
    public void successMessageHasAppeard() {
       assertEquals(pages.registration().getSuccessMessage(), pages.registration().getResult()); 
    }

    @When("user opens Blog link")
    public void userClicksOnBlogLink(){        
        pages.registration().clickBlogLink();
    }

    @Then("Blog page is shown")
    public void blogPageIsShown(){
       assertEquals("Blog | Demoqa | Just another WordPress site", pages.blog().getTitle());
    }	
}