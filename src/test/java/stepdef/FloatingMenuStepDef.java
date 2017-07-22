package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.FloatingMenu;

public class FloatingMenuStepDef {

	FloatingMenu fm = new FloatingMenu();
	
	@Then("^click on Home button$")
	public void click_on_Home_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fm.Home();
	}

	@Then("^click on News button$")
	public void click_on_News_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fm.News();
	}

	@Then("^click on Contact button$")
	public void click_on_Contact_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fm.Contact();
	}

	@Then("^click on About button$")
	public void click_on_About_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fm.About();
	}

	
}
