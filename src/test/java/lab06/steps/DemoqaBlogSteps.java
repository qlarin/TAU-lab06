package lab06.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

import lab06.Pages;

public class DemoqaBlogSteps {
	
	private final Pages pages;

	public DemoqaBlogSteps(Pages pages) {
		this.pages = pages;
	}

    @Given("user is on Blog page")
    public void userIsOnHomePage(){        
        pages.blog().open();    
    }

    @When("user opens Sample post link")
    public void userClicksOnSamplePostLink(){        
        pages.blog().clickSamplePostLink();
    }

    @Then("Sample post page is shown")
    public void samplePostPageIsShown(){
       assertEquals("Sample Post2 | Demoqa", pages.samplePost().getTitle());
    }	
}