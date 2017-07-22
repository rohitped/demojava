package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.ContextMenu;

public class ContextMenuStepDef {
	
	ContextMenu cm = new ContextMenu();
	
	@Then("^click on this open issue link$")
	public void click_on_this_open_issue_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	cm.OpenIssue();
	}

	@Then("^click on Elemental Selenium link$")
	public void click_on_Elemental_Selenium_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	cm.Footer();
	}



}
