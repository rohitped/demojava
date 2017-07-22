package pageobjects;

import generic.SeleniumClass;

public class MultipleWindows extends SeleniumClass{
	
	String xpathHeader = ".//*[@id='content']/div/h3";
	String xpathClickHere = ".//*[@id='content']/div/a";
	String xpathNewWindowHeader = "html/body/div[1]/h3";
	
	
	public void clickOnLink(){
		
		element = this.locateElement(xpathClickHere, "xpath");
		this.clickElement(element);
	}
	
}
