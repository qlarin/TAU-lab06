package lab06.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

import lab06.Pages;

public class DemoqaHomeSteps {
	
	private final Pages pages;

	public DemoqaHomeSteps(Pages pages) {
		this.pages = pages;
	}

    @Given("user is on Home page")
    public void userIsOnHomePage(){        
        pages.home().open();        
    }

    @When("user opens Registration link")
    public void userClicksOnRegistrationLink(){        
        pages.home().clickRegistrationLink();
    }

    @Then("Registration page is shown")
    public void registrationPageIsShown(){
       assertEquals("Registration | Demoqa", pages.registration().getTitle());
    }	
}