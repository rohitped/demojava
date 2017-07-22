package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.ForgotPassword;

public class ForgotPasswordStepDef {
	
	ForgotPassword fp = new ForgotPassword();
	
	@Then("^enter email as \"([^\"]*)\"$")
	public void enter_email_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fp.EmailTextBox(arg1);
	}

	@Then("^click on Retrieve Password button$")
	public void click_on_Retrieve_Password_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fp.RetrievePassword();
	}

}
