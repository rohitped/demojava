package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.ChallengingDOM;

public class ChallengingDOMStepDef {
	
	ChallengingDOM cd = new ChallengingDOM();

	@Then("^click on baz link$")
	public void click_on_baz_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	cd.clickOnbaz();  
	}

	@Then("^click on foo link$")
	public void click_on_foo_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	cd.clickOnFoo();
	}

	@Then("^click on edit link$")
	public void click_on_edit_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	cd.clickOnEdit();
	}

	@Then("^click on delete link$")
	public void click_on_delete_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	cd.clickOnDelete();
	}
	
}
