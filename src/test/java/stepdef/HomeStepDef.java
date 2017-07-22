package stepdef;

import java.util.LinkedHashSet;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import pageobjects.HomePage;

public class HomeStepDef extends HomePage {
	
	
	HomePage hp = new HomePage();
	
	FormAuthStepDef fasd = new FormAuthStepDef(); 
	
	
//	HomeStepDef ab = new HomeStepDef(); 


	@When("^user selects \"([^\"]*)\" browser$")
	public void user_selects_browser(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
		hp.selectBrowser(arg1);
		
		//System.out.println("It should select browser");
	}

	@When("^launches \"([^\"]*)\"$")
	public void launches(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hp.launchApp(arg1);
		
		//System.out.println("It should launch browser");
		
		}
	
	@Then("^verify \"([^\"]*)\" is present in url$")
	public void verify_is_present_in_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   hp.verifyCurrentURL(arg1);
	}

	@Then("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   hp.clickLink(arg1);
	}

	@After
	@Then("^close application$")
	public void close_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hp.closeApp(true);
		//System.out.println("It should close application");
	  //System.out.println();
	}


	@Then("^get all links present on home page$")
	public void get_all_links_present_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   LinkedHashSet<String> lhs = hp.getAllLinks();
	   hp.verifyAllLinks(lhs);
	}


	
	
	
}
