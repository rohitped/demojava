package pageobjects;

import generic.SeleniumClass;

public class ForgotPassword extends SeleniumClass {

	String xpathEmailTextBox = ".//*[@id='email']";
	String xpathRetrievePassword = ".//*[@id='form_submit']";
	
	public void EmailTextBox(String email){
		element = this.locateElement(xpathEmailTextBox, "xpath");
		this.passValuesToTextBox(element, email );;
	}
	
	public void RetrievePassword(){
		element = this.locateElement(xpathRetrievePassword, "xpath");
		this.clickElement(element);
	}
}
