package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.DisappearingElements;

public class DisappearingElementStepDef {
	
	DisappearingElements de = new DisappearingElements();

	@Then("^click on Home link$")
	public void click_on_Home_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		de.Home();
	}

	@Then("^click on About link$")
	public void click_on_About_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		de.About();
	}

	@Then("^click on ContactUS link$")
	public void click_on_ContactUS_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		de.ContactUs();
	}

	@Then("^click on PortFolio link$")
	public void click_on_PortFolio_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		de.PortFolio();
	}

	@Then("^click on Gallery link$")
	public void click_on_Gallery_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		de.Gallery();
	}

}
