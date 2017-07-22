package pageobjects;

import generic.SeleniumClass;

public class DropDownPage extends SeleniumClass{

	String xpathHeader = ".//*[@id='content']/div/h3";
	String xpathoption1 = ".//*[@id='dropdown']/option[1]";
	String xpathoption2 = ".//*[@id='dropdown']/option[2]";
	String xpathoption3 = ".//*[@id='dropdown']/option[3]";

	String idDropdown = "dropdown";
	
	public void selectValue(String type, String value){
		
		
		
		element = this.locateElement(idDropdown,  "id");
		super.selectValuesFromDropdown(type, value,element);
	}


}
