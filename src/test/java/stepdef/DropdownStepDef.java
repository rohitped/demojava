package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.DropDownPage;

public class DropdownStepDef {
	
	DropDownPage dd = new DropDownPage();
	

	@Then("^select value by \"([^\"]*)\" with \"([^\"]*)\"$")
	public void select_value_by_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dd.selectValue(arg1, arg2);
	}
	
}
