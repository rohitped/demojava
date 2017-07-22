package pageobjects;

import java.util.LinkedHashSet;

import org.openqa.selenium.WebElement;
import generic.SeleniumClass;

public class HomePage extends SeleniumClass {

	private String linkTextHomeLinks = "%s";
	private String tagNameHomeLinks = "a";
	
	public void clickLink(String linkName){
		
		linkTextHomeLinks = String.format(linkTextHomeLinks, linkName);
		System.out.println(linkTextHomeLinks);
		element = this.locateElement(linkTextHomeLinks, "linktext");
		this.clickElement(element);
	
	
	}
	
	
	public LinkedHashSet<String> getAllLinks(){
		
		
		this.listOfElements = super.locateElements(tagNameHomeLinks, "tagName");
	//	System.out.println(this.listOfElements.size());
	
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs = super.getListTextFromWebElementList(listOfElements);
		
		this.writeExcel("abc.xlsx",lhs);
		
		
		return lhs;
	
	
	}

	public void verifyAllLinks(LinkedHashSet<String> linkTextList){
		
	
		
	}
	
}
