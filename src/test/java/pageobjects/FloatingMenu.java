package pageobjects;

import generic.SeleniumClass;

public class FloatingMenu extends SeleniumClass {

	String xpathHome = ".//*[@id='menu']/ul/li[1]/a";
	String xpathNews = ".//*[@id='menu']/ul/li[2]/a";
	String xpathContact = ".//*[@id='menu']/ul/li[3]/a";
	String xpathAbout = ".//*[@id='menu']/ul/li[4]/a";
	
	public void Home(){
		element = this.locateElement(xpathHome, "xpath");
		this.clickElement(element);
	}
	
	public void News(){
		element = this.locateElement(xpathNews, "xpath");
		this.clickElement(element);
	}
	
	public void Contact(){
		element = this.locateElement(xpathContact, "xpath");
		this.clickElement(element);
	}
	
	public void About(){
		element = this.locateElement(xpathAbout, "xpath");
		this.clickElement(element);
	}
}
