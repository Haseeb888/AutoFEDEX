package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Utilites.browserEngine;
import Utilites.testData;


@RunWith(Cucumber.class)
	public class T01_homepgValidation { 
	
	public static WebDriver driver;
	
	    @Given("^Home page of Fedex website$")
	    public void home_page_of_fedex_website() throws Throwable {
	        driver=browserEngine.getBrowser();
	        driver.get(testData.homepageURL);
	        
	    }

	    @When("^user opens home page of Fedex$")
	    public void user_opens_home_page_of_fedex() throws Throwable {
	        System.out.println("Home Page Launched");
	    }

	    @Then("^Fedex home page is launched$")
	    public void fedex_home_page_is_launched() throws Throwable {
	        throw new PendingException();
	    }

		@And("^title gets validated$")
	    public void title_gets_validated() throws Throwable {
	    	
	    	String eTitle=testData.eTitle;
	    	
	    	String aTitle=driver.getTitle();
	   Assert.assertEquals(eTitle, aTitle); 	
	   
	    	
	    }

	}

