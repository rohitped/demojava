package pageobjects;

import generic.SeleniumClass;

public class ChallengingDOM extends SeleniumClass {
	
	String xpathHeader1 = ".//*[@id='content']/div/h3";
	String xpathMessage = ".//*[@id='content']/div/p";
	String xpathfoo = ".//*[@id='content']/div/div/div/div[1]";
	String xpathbaz = ".//*[@id='content']/div/div/div/div[1]";
	String xpathgreenfoo = ".//*[@id='4795d520-4e02-0135-6c49-526b3328bc89']";
	String xpathedit = ".//*[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]";
	String xpathdelete = ".//*[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[2]";
	
	
	public void clickOnbaz(){
		
		element = this.locateElement(xpathbaz, "xpath");
		this.clickElement(element);
	}
	
	public void clickOnFoo(){
			
			element = this.locateElement(xpathfoo, "xpath");
			this.clickElement(element);
		}
		
	public void clickOngreenfoo(){
		
		element = this.locateElement(xpathgreenfoo, "xpath");
		this.clickElement(element);
	}
	
	public void clickOnEdit(){
		
		element = this.locateElement(xpathedit, "xpath");
		this.clickElement(element);
	}

	public void clickOnDelete(){
			
			element = this.locateElement(xpathdelete, "xpath");
			this.clickElement(element);
		}

}