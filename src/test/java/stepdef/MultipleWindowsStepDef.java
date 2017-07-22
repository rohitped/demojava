package stepdef;

import cucumber.api.java.en.Then;
import generic.SeleniumClass;
import pageobjects.MultipleWindows;

public class MultipleWindowsStepDef {
	
	MultipleWindows mwsd = new MultipleWindows();

	@Then("^click on click here link$")
	public void click_on_click_here_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mwsd.clickOnLink();
	
	}
	
	@Then("^switch to another window$")
	public void switch_to_another_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mwsd.switchToAnotherWindow();
	}


}
