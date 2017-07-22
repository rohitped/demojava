package pageobjects;

import generic.SeleniumClass;

public class DragAndDrop extends SeleniumClass{
	
	String xpathHeader = ".//*[@id='content']/div/h3";
	String xpathPostion1 = ".//*[@id='column-a']";
	String xpathPosition2 = ".//*[@id='column-b']";
	
	public void DragAB(){
		element = this.locateElement(xpathPostion1, "xpath");
		this.clickElement(element);
	}
	
	public void gitdiff(){
		
	}
	
	public void DragBA(){
		element = this.locateElement(xpathPosition2, "xpath");
		
	}
}
