package pageobjects;

import generic.SeleniumClass;

public class ContextMenu extends SeleniumClass {

	String xpathHeader1 = ".//*[@id='content']/div/h3";
	String xpathMessage1 = ".//*[@id='content']/div/p[1]";
	String xpathMessage2 = ".//*[@id='content']/div/p[2]";
	String xpathBox = ".//*[@id='hot-spot']";
	String xpathNote = ".//*[@id='content']/strong";
	String xpathOpenIssue = ".//*[@id='content']/strong/a";
	String xpathFooter = ".//*[@id='page-footer']/div/div/a";
	
	public void OpenIssue(){
		
		element = this.locateElement(xpathOpenIssue, "xpath");
		this.clickElement(element);
	}
	
	public void Footer(){
		
		element = this.locateElement(xpathFooter, "xpath");
		this.clickElement(element);
	}
}
