package lab06.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

import lab06.Pages;

public class DemoqaSamplePostSteps {
	
	private final Pages pages;

	public DemoqaSamplePostSteps(Pages pages) {
		this.pages = pages;
	}

    @Given("user is on Sample post page")
    public void userIsOnSamplePostPage(){        
        pages.samplePost().open();    
    }

    @When("user fills author in form")
    public void userFillsUsername() {
        pages.samplePost().fillUserName();
    }

    @When("user fills email in form")
    public void userFillsEmail() {
        pages.samplePost().fillEmail();
    }

    @When("user fills comment in form")
    public void userFillsComment() {
        pages.samplePost().fillComment();
    }

    @When("user clicks submit button in form")
    public void userClicksSubmitButton() {
        pages.samplePost().clickSubmitButton();
    }

    @Then("comment is shown on comment list")
    public void commentShownOnCommentList() {
        assertEquals(pages.samplePost().getSampleComment(), pages.samplePost().getResult());
    }

}