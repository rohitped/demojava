package pageobjects;

import generic.SeleniumClass;

public class DisappearingElements extends SeleniumClass {

	String xpathHeader = ".//*[@id='content']/div/h3";
	String xpathMessage = ".//*[@id='content']/div/p";
	String xpathHome = ".//*[@id='content']/div/ul/li[1]/a";
	String xpathAbout = ".//*[@id='content']/div/ul/li[2]/a";
	String xpathContactUs = ".//*[@id='content']/div/ul/li[3]/a";
	String xpathPortFolio = ".//*[@id='content']/div/ul/li[4]/a";
	String xpathGallery = ".//*[@id='content']/div/ul/li[5]/a";
	
	public void Home(){
		element = this.locateElement(xpathHome, "xpath");
		this.clickElement(element);
	}
	
	public void About(){
		element = this.locateElement(xpathAbout, "xpath");
		this.clickElement(element);
	}
	
	public void ContactUs(){
		element = this.locateElement(xpathContactUs, "xpath");
		this.clickElement(element);
	}
	
	public void PortFolio(){
		element = this.locateElement(xpathPortFolio, "xpath");
		this.clickElement(element);
	}
	
	public void Gallery(){
		element = this.locateElement(xpathGallery, "xpath");
		this.clickElement(element);
	}
}
