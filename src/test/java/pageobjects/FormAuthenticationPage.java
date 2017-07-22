package pageobjects;

import generic.SeleniumClass;

public class FormAuthenticationPage extends SeleniumClass{

//	String xpathUserName = "html/body/div[2]/div/div/form/div[1]/div/input";
	String xpathUserName = "//input[@id='username']";
//	String xpathPassword = "html/body/div[2]/div/div/form/div[2]/div/input";
	String xpathPassword = "//input[@id='password']";
//	String xpathLoginButton = "html/body/div[2]/div/div/form/button/i";
	String xpathLoginButton = "//form[@id='login']/button";
	
//	String xpathMsg = "html/body/div[1]/div/div";
	String xpathValidCreds = "//div[@id='flash']";
//	String xpathHeader = "html/body/div[2]/div/div/h2";
	String xpathHeader = "//div[@id='content']/div/h2";
	String xpathBodyText = "html/body/div[2]/div/div/h4";
//	String xpathBodyText = "";
//	String xpathLogOut = "html/body/div[2]/div/div/a";
	String xpathLogOut = "//div[@id='content']/div/a";

	
	public void enterUsername (String uname){
		
		element = this.locateElement(xpathUserName, "xpath");
		this.passValuesToTextBox(element, uname);
		
	}
	
	public void enterPassword (String pword){
		
		element = this.locateElement(xpathPassword, "xpath");
		this.passValuesToTextBox(element, pword);
	}
	
	public void clickLoginButton(){
		
		element = this.locateElement(xpathLoginButton, "xpath");
		this.clickElement(element);
	
	}
	
	public void clickLogoutButton(){
		
		element = this.locateElement(xpathLogOut, "xpath");
		this.clickElement(element);
	}




}
